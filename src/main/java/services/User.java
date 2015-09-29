package services;

/**
 * 
 * @author robbiebyr
 *
 */
public class User {
	
	private String userName;
	private String emailAddress;
	
	public User(String userName, String emailAddress){
		this.userName = userName;
		this.emailAddress = emailAddress;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

}
