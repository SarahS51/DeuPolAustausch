package user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.stream.events.Characters;

import connection.ConnectionManager;
import constants.DatabaseInformation;
import constants.FieldConstants;
import constants.PupilStatusConstants;

public class Pupil extends User {
	private String firstName = "";
	private String lastName = "";
	private String street = "";
	private String postcode = "";
	private String houseNumber = "";
	private String city = "";
	private String birthdate = "";
	private String telephone = "";
	private String schoolClass = "";
	private String specialDiet = "";
	private String physicalimpairment = "";
	private String gender = "";
	private String classTeacher = "";
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
	
	public String getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public String getPostcode() {
		return postcode;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
		formatBirthdate();
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
		} else if(FieldConstants.BIRTHDAY == fieldType) {
			Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(input);
			boolean specialCharacter = matcher.find();
			if(specialCharacter)  {
				int dotCounter = 0;
				boolean dotFound = true;
				for(int i = 0; i < input.length(); i++) {
					if( '.' == input.charAt(i)) {
						dotCounter++;
					} 
					if(!Character.isDigit(input.charAt(i)) && (i != 2 || i != 5)) {
						ok = false;
					} else if('.' != input.charAt(i)) {
						ok = false;
					}
				}
				if(dotCounter != 2) {
					ok = false;
				}
			}
		}
		return ok;
	}
	
	private void formatBirthdate() {
		String[] birthdateList = birthdate.split(".");
		birthdate = "";;
		for(int i = birthdateList.length-1; i > -1; i--) {
			if(i > 0) {
				birthdate += birthdateList[i] + "-";
			} else {
				birthdate += birthdateList[i];
			}
		}
	}

	public boolean selectPupil() throws SQLException {
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector= new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		
		String sql = "SELECT Name, Firstname, Gender, Birthdate, Street, Housenumber,"
				+ "	Postalcode, City, Telephone, Class, Classteacher, Specialdiet,"
				+ "	Physicalimpairment, EmCo_Name, EmCo_Firstname, EmCo_Telephone, StatusID"
				+ " WHERE PupilID = ?";
		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
			pStmt.setInt(1, this.getUserId());
			try(ResultSet rs = pStmt.executeQuery()) {
				
			}
		}
		connector.closeConnection();
		return success;
	}
	
	public boolean updatePupil() throws SQLException {
		boolean success = true;
		DatabaseInformation databaseInformation = new DatabaseInformation();
		ConnectionManager connector= new ConnectionManager(databaseInformation.getDatebaseURL(), databaseInformation.getDatabaseUser(), databaseInformation.getDatabasePassword());
		
		String sql = "UPDATE pupil"
				+ " SET Name = ?, Firstname = ?, Gender = ?, Birthdate = ?, Street = ?, Housenumber = ?,"
				+ " Postalcode = ?, City = ?, Telephone = ?, Class = ?, Classteacher = ?, Specialdiet = ?,"
				+ " Physicalimpairment = ?, EmCo_Name = ?, EmCo_Firstname = ?, EmCo_Telephone = ?, StatusID = ?"
				+ " WHERE PupilID = ?";
		try(PreparedStatement pStmt = connector.getConnection().prepareStatement(sql)) {
			pStmt.setString(1, lastName);
			pStmt.setString(2, firstName);
			pStmt.setString(3, gender);
			pStmt.setString(4, birthdate);
			pStmt.setString(5, street);
			pStmt.setString(6, houseNumber);
			pStmt.setString(7, postcode);
			pStmt.setString(8, city);
			pStmt.setString(9, telephone);
			pStmt.setString(10, schoolClass);
			pStmt.setString(11, classTeacher);
			pStmt.setString(12, specialDiet);
			pStmt.setString(13, physicalimpairment);
			pStmt.setString(14, emergencyContact.getName());
			pStmt.setString(15, emergencyContact.getFirstName());
			pStmt.setString(16, emergencyContact.getTelephone());
			pStmt.setInt(17, PupilStatusConstants.REGISTERED);
			pStmt.setInt(18, this.getUserId());
			
			pStmt.execute();
		}
		connector.closeConnection();
		return success;
	}
	
}
