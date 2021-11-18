package user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import connection.ConnectionManager;
import constants.DatabaseInformation;

public class PupilCreator {
	private String registerKey = "";
	private String eMail = "";
	private String password = "";
	
	public String getRegisterKey() {
		return registerKey;
	}


	public void setRegisterKey(String registerKey) {
		this.registerKey = registerKey;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * Legt einen neuen Schüler in der Tabelle pupil an
	 * 
	 * @return true, wenn erfolgreich angelegt, sonst false
	 * @throws SQLException
	 */
	public boolean createUser() throws SQLException {
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector = new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		
		String keyDate = "";
		int keyId = -1;
		
		String sql = "SELECT KeyID, GenDate FROM keyslist"
				+ " WHERE JoinKey = ?";
		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
			pStmt.setString(1, this.registerKey);
			try(ResultSet rs = pStmt.executeQuery()) {
				if(rs.next()) {
					keyDate = rs.getString("GenDate");
					keyId = rs.getInt("keyID");
				} else {
					success = false;
				}
			}
		}
		if(success) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		    LocalDateTime now = LocalDateTime.now();
		    String today = dtf.format(now);
		    today = today.replaceAll("-", "");
		    keyDate = keyDate.replaceAll("-", "");
		    if(30 >= Integer.parseInt(today)-Integer.parseInt(keyDate)) {
		    	sql = "SELECT 1 FROM pupil"
		    			+ " WHERE EMail = ?";
		    	try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
		    		pStmt.setString(1, eMail);
		    		try(ResultSet rs = pStmt.executeQuery()) {
		    			if(rs.next()) {
		    				success = false;
		    			}
		    		}
		    	}
		    	if(success) {
		    		PasswordHasher passwordHasher = new PasswordHasher();
		    		password = passwordHasher.hashPassword(password);
		    		sql = "INSERT INTO pupil(EMail, Password, RoleID)"
		    				+ "VALUES('" + eMail + "', '" + password + "', 3);";
		    		success = connector.executeInsertSQL(sql);
		    	}
		    	if(success) {
		    		sql = "DELETE FROM keyslist"
		    				+ " WHERE keyID = ?";
		    		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
		    			pStmt.setInt(1, keyId);
		    			success = pStmt.execute();
		    		}
		    	}
		    } else {
		    	success = false;
		    	sql = "DELETE FROM keyslist"
	    				+ " WHERE keyID = ?";
	    		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
	    			pStmt.setInt(1, keyId);
	    			success = pStmt.execute();
	    		}
	    		createUser();
		    }
		}
		
		connector.closeConnection();
		return success;
	}
	
}