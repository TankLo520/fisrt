package day2_task_deep;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
	public static List<User> users= new ArrayList<User>();
	static{
		users.add(new User("lbx", "123456"));
		users.add(new User("lbx2", "1234561"));
		users.add(new User("lbx3", "1234561"));
		users.add(new User("lbx4", "1234561"));
	}
	public static List<User> getUsers() {
		return users;
	}

	
	
}
