package user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import constants.FieldConstants;

public class Pupil extends PupilCreator {
	private String firstName = "";
	private String lastName = "";
	private String street = "";
	private String postcode = "";
	private String houseNumber = "";
	private String city = "";
	private String telephone = "";
	private String schoolClass = "";
	private String specialDiet = "";
	private String physicalimpairment = "";
	private EmergancyContact emergencyContact = new EmergancyContact();
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSchoolClass() {
		return schoolClass;
	}
	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}
	public String getSpecialDiet() {
		return specialDiet;
	}
	public void setSpecialDiet(String specialDiet) {
		this.specialDiet = specialDiet;
	}
	public String getPhysicalimpairment() {
		return physicalimpairment;
	}
	public void setPhysicalimpairment(String physicalimpairment) {
		this.physicalimpairment = physicalimpairment;
	}
	public EmergancyContact getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(EmergancyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	
	public boolean checkInput(int fieldType, String input) {
		boolean ok = true;
		if(FieldConstants.POSTCODE == fieldType) {
			if(input.length() != 5) {
				ok = false;
			}
			for(int i = 0; i < input.length(); i++) {
				if(!Character.isDigit(input.charAt(i))) {
					ok = false;
				}
			}
		} else if(FieldConstants.PHONENUMBER == fieldType) {
			for(int i = 0; i < input.length(); i++) {
				if(!Character.isDigit(input.charAt(i))) {
					if(i != 0 && input.charAt(i) != '+') {
						ok = false;
					}
				}
			}
		} else if(FieldConstants.STREET_NAME == fieldType || FieldConstants.NAME == fieldType) {
			Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(input);
			boolean specialCharacter = matcher.find();
			if(specialCharacter)  {
				for(int i = 0; i < input.length(); i++) {
					if(i == 0) {
						ok = false;
					} else if('-' != input.charAt(i)) {
						if(FieldConstants.STREET_NAME == fieldType && '.' != input.charAt(i) ) {
							ok = false;
						} else {
							ok = false;
						}
					}
				}
			}
		} 
		return ok;
	}
	
}
