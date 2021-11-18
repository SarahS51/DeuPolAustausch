package user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionManager;
import constants.DatabaseInformation;
import constants.RoleConstants;

public class Admin extends Teacher {
	
	/**
	 * Legt einen neuen Lehrer in der Tabelle teacher an
	 * 
	 * @param eMail
	 * @param password
	 * @param firstName
	 * @param name
	 * @param role
	 * 
	 * @return true wenn erfolgreich angelegt, sonst false 
	 * @throws SQLException
	 */
	public boolean createTeacher(String eMail, String password, String firstName, String name, int role) throws SQLException {
		boolean success = true;
		PasswordHasher passwordHasher = new PasswordHasher();
		password = passwordHasher.hashPassword(password);
		
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector= new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		
		String sql = "SELECT 1 FROM teacher"
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
    		sql = "INSERT INTO teacher(Email, Password, Firstname, Name, RoleID)"
    				+ "VALUES('" + eMail + "', '" + password + "', '" + firstName + "', '" + name + "', " + role + ")";
    		
    		connector.executeInsertSQL(sql);
    	}
    	
		connector.closeConnection();
		return success;
	}
	
	/**
	 * Ändert die Rolle eines Lehreres zu Admin oder Lehrer
	 * 
	 * @param eMail
	 * @param newRole
	 * @return true wenn erfolgreich geändert, sonst false
	 * @throws SQLException
	 */
	public boolean changeTeacherRole(String eMail, int newRole) throws SQLException {
		if(newRole != RoleConstants.ADMIN && newRole != RoleConstants.TEACHER) {
			return false;
		}
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector= new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		
		String sql = "SELECT 1 FROM teacher"
				+ " WHERE Email = ?";
		
		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
			pStmt.setString(1, eMail);
			try(ResultSet rs = pStmt.executeQuery()) {
				if(rs.next()) {
					success = true;
				}
			}
		}
		if(success) {
			sql = "UPDATE teacher"
					+ " SET roleID = ?"
					+ " WHERE Email = ?";
			try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
				pStmt.setInt(1, newRole);
				pStmt.setString(2, eMail);
				pStmt.execute();
			}
		}
		return success;
	}
}
