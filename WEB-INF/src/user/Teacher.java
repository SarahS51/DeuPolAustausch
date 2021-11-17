package user;

import java.util.Random;

public class Teacher {
	
	/**
	 * Erstellt einen zufällig generierten 50 Zeichen langen String
	 * @return registerKey
	 */
	public String generateRegisterKey() {
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
