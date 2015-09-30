package services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author robbiebyr
 *
 */
public class UserTest {

	private User testUser;
	private User recieverUser;
	private User giverUser;

	@Before
	public void setup(){
		testUser = new User("test", "abc@123.com");
		recieverUser = new User("reciever", "def@123.com");
		giverUser = new User("giver", "ghi@123.com");
	}

	@Test
	public void isBasicUserCreatedCorrectly(){
		assertThat(testUser.getUserName(), is("test"));
		assertThat(testUser.getEmailAddress(), is("abc@123.com"));
	}

	@Test
	public void isExtraUserDataAddedCorrectly(){
		testUser.setPresentGiverTo(recieverUser);
		assertThat(testUser.getPresentGiverTo(), is(recieverUser));
		assertThat(testUser.getPresentGiverTo().getUserName() , is("reciever"));
	}

	@Test
	public void isExtraUserDataAddedCorrectly2(){
		testUser.setPresentRecieverFrom(giverUser);
		assertThat(testUser.getPresentRecieverFrom(), is(giverUser));
		assertThat(testUser.getPresentRecieverFrom().getUserName() , is("giver"));
	}
}
