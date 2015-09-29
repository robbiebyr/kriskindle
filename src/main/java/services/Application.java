package services;

import java.util.*;

/**
 * 
 * @author robbiebyr
 *
 */
public class Application {
	
	private static List<User> usersInSystem = new ArrayList<User>();
	private static List<User> presentGiver;
	private static List<User> presentReciever;
	
	public static void main(String[] args){
		//read file
		String[] users = null;
		//create users
		for(String user : Arrays.asList(users)){
			String[] userSplit = user.split(":");
			User kk = new User(userSplit[0], userSplit[1]);
			usersInSystem.add(kk);
		}
		createLists();
		//assign user to gifter and giftee
		while(!presentGiver.isEmpty()){
			logic();
		}
	}

	private static void createLists() {
		presentGiver.addAll(usersInSystem);
		presentReciever.addAll(usersInSystem);
	}
	
	private static void logic(){
		int randomUserId1 = 100 % usersInSystem.size();
		int randomUserId2 = 100 % usersInSystem.size();
		
		User giver = presentGiver.get(randomUserId1);
		User reciever = presentReciever.get(randomUserId2);
		
		if(giver != reciever){
			giver.setPresentGiverTo(reciever);
			reciever.setPresentRecieverFrom(giver);
			presentGiver.remove(giver);
			presentReciever.remove(reciever);
		}
	}

}
