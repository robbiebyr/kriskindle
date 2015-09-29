package services;

/**
 * 
 * @author robbiebyr
 *
 */
public class User {
	
	private String userName;
	private String emailAddress;
	
	private User presentGiverTo;
	private User presentRecieverFrom;
	
	
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

	public User getPresentGiverTo() {
		return presentGiverTo;
	}

	public void setPresentGiverTo(User presentGiverTo) {
		this.presentGiverTo = presentGiverTo;
	}

	public User getPresentRecieverFrom() {
		return presentRecieverFrom;
	}

	public void setPresentRecieverFrom(User presentRecieverFrom) {
		this.presentRecieverFrom = presentRecieverFrom;
	}
	
}
