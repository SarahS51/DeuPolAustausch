package constants;

/**
 * Klasse, die die Informationen zum Herstellen einer Datenbankverbindung enhth?lt
 * 
 * @author sschallehn
 *
 */
public class DatabaseInformation {
	private String datebaseURL = "jdbc:mysql://localhost:3306/deupol";
	private String databaseUser = "root";
	private String databasePassword = "root";
	
	public String getDatebaseURL() {
		return datebaseURL;
	}
	
	public String getDatabaseUser() {
		return databaseUser;
	}
	
	public String getDatabasePassword() {
		return databasePassword;
	}

	
	
	
}
