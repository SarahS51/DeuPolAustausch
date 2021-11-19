package user;

/**
 * Klasse, die als Paket zum Speichern eines Objekts vom Typ User dient.
 * So kann der User später mit <jsp:useBean...> verwendet werrden
 * 
 * @author sschallehn
 *
 */
public class UserInformation {
	private User user = new User();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
}
