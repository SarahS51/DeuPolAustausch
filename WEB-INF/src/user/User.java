package user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionManager;
import constants.DatabaseInformation;
import constants.RoleConstants;

public class User {
	private String eMail = "";
	private String password = "";
	private int userId = 0;
	private int role = 0;
	
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
	
	public int getRole() {
		return this.role;
	}
	
	public int getUserId() {
		return userId;
	}

	/**
	 * Versucht einen Benutzer mit der Kombination aus eingegeber E-Mail und Passwort in der Datenbank zu finden
	 * 
	 * @return true wenn ein Nutzer gefunden wurde, sonst false
	 * @throws SQLException
	 */
	public boolean login() throws SQLException {
		boolean success = true;
		PasswordHasher passwordHasher = new PasswordHasher();
		password = passwordHasher.hashPassword(password);
		DatabaseInformation dbInformation = new DatabaseInformation();
		
		ConnectionManager connector = new ConnectionManager(dbInformation.getDatebaseURL(), dbInformation.getDatabaseUser(), dbInformation.getDatabasePassword());
		
		String sql = "SELECT PupilID FROM pupil"
				+ " WHERE Email = ? AND Password = ?";
		
		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
			pStmt.setString(1, eMail);
			pStmt.setString(2, password);
			try(ResultSet rs = pStmt.executeQuery()) {
				if(rs.next()) {
					userId = rs.getInt("PupilID");
					role = RoleConstants.PUPIL;
				} else {
					success = false;
				}
			}
		}
		if(!success) {
			success = true;
			sql = "SELECT TeacherID, RoleID FROM pupil"
				+ " WHERE Email = ? AND Password = ?";	
			try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
				pStmt.setString(1, eMail);
				pStmt.setString(2, eMail);
				try(ResultSet rs = pStmt.executeQuery()) {
					if(rs.next()) {
						userId = rs.getInt("TeacherID");
						role = rs.getInt("RoleID");
					} else {
						success = false;
					}
				}
			}
		}
		connector.closeConnection();
		return success;
	}

}
