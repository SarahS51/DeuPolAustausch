package user;

import connection.ConnectionManager;
import constants.DatabaseInformation;

public class User {
	private String registerKey = "";
	private String eMail = "";
	private String password = "";
	
	public boolean createUser() {
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector = new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		
		return true;
	}
	
}
