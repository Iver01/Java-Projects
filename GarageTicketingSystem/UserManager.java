package GarageTicketingSystem;

import java.util.HashMap;

public class UserManager {
	private static HashMap<String, String> Users;
	//USERS
    static {
        Users = new HashMap<>();
        Users.put("iverson", "iver");
    }
    //GET NEW USERNAME AND PASSWORD
    public static HashMap<String, String> GetUsers() {
        return Users;
    }
    //ADD THE NEW USERNAME AND PASSWORD
    public static void AddUser(String Username, String Password) {
        Users.put(Username, Password);
    }
}