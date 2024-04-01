package ui;

import model.User;
import model.Vendor;
import util.Console;

public class UserManagerApp {

	public static void main(String[] args) {
		System.out.println("Hello, welcome to the User Manager");
		int id = Console.getInt("Enter user id : ");
		String username = Console.getString("Enter username : ");
		String fn = Console.getString("Enter first name: ");
		String ln = Console.getString("Enter last name: ");
		
		User u = new User(id, username, fn, ln);
		System.out.println(u);
		System.out.println(u.getUsername());
		
		Vendor v1 = new Vendor();
		v1.id = 1;
		v1.name = "George";
		System.out.println(v1.id);
		
		
		
		
		System.out.println("Bye!");
		

	}

}
