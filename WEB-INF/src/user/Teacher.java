package user;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import connection.ConnectionManager;
import constants.DatabaseInformation;

public class Teacher {
	
	public boolean createRegisterKey() throws SQLException {
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector= new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
	    LocalDateTime today = LocalDateTime.now();  
	    String key = generateRegisterKey();
	    key = key.replaceAll("'", "y");
	    
	    String sql = "INSERT INTO keyslist(JoinKey, GenDate)"
	    		+ " VALUES('" + key + "','" + dtf.format(today) + "');";
	    
	    if(!connector.executeInsertSQL(sql)) {
	    	success = false;
	    }
		if(!connector.closeConnection()) {
			success = false;
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
