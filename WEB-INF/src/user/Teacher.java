package user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import connection.ConnectionManager;
import constants.DatabaseInformation;
import constants.PupilStatusConstants;

public class Teacher extends User {
	
	/**
	 * Erstellt einen Registierungsschlüssen und speichert diesen in der Datenbank
	 * 
	 * @return true wenn erfolgreich, sonst false
	 * @throws SQLException
	 */
	public boolean createRegisterKey() throws SQLException {
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector= new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
	    LocalDateTime today = LocalDateTime.now();  
	    String key = generateRegisterKey();
	    key = key.replaceAll("'", "y");
	    
	    String sql = "";
	    
	    sql = "INSERT INTO keyslist(JoinKey, GenDate)"
	    		+ " VALUES('" + key + "','" + dtf.format(today) + "');";
	    
	    if(!connector.executeInsertSQL(sql)) {
	    	success = false;
	    }
		connector.closeConnection();
		return success;
	}
	
	/**
	 * Ändert den Status eines Schülers
	 * 
	 * @param pupilId
	 * @param newStatus
	 * @return true, wenn der Status erfolgreich geändert wurde, sonst falsch
	 * @throws SQLException
	 */
	public boolean changePupilStatus(int pupilId, int newStatus) throws SQLException {
		if(1 > newStatus && 6 < newStatus) {
			return false;
		}
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector= new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		
		String sql = "SELECT 1 from pupil"
				+ " WHERE PupilID = ?";
		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
			pStmt.setInt(1, pupilId);
			try(ResultSet rs = pStmt.executeQuery()) {
				if(!rs.next()) {
					success = false;
				}
			}
		}
		
		if(success) {
			if(newStatus == PupilStatusConstants.FINISHED) {
				sql = "UPDATE pupil"
						+ " SET StatusID = ?, AND EMail = ?"
						+ " WHERE PupilID = ?";
				try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
					pStmt.setInt(1, newStatus);
					pStmt.setString(2, "-");
					pStmt.setInt(3, pupilId);
					pStmt.execute();
				}
			} else {
				sql = "UPDATE pupil"
						+ " SET StatusID = ?"
						+ " WHERE PupilID = ?";
				try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
					pStmt.setInt(1, newStatus);
					pStmt.setInt(2, pupilId);
					pStmt.execute();
				}
			}
			
		}
		return success;
	}
	
	/**
	 * Erstellt einen zufällig generierten 50 Zeichen langen String
	 * @return registerKey
	 */
	private String generateRegisterKey() {
		String registerKey = "";
		int leftLimit = 33; 
	    int rightLimit = 122; 
	    int targetStringLength = 50;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    registerKey = buffer.toString();

		return registerKey;
	}
}
