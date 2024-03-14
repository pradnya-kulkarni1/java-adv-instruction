package ui;

import java.util.Scanner;

import model.Contact;
import util.Console;

public class contactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List App");
		
//		Contact c1 = new Contact();
//		c1.setFirstName("George");
//		c1.setLastName("McFly");
//		c1.setEmail("george@b2f.com");
//		c1.setPhone("123-222-4567");
//		
//		System.out.println(c1.getFirstName());
//		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
				
		// prompt for all four instance variables
		
		String firstName = Console.getString("Enter first name: ");
		String lastName = Console.getString("Enter last name: ");
		String email = Console.getString("Enter email: ");
		String phone = Console.getString("Enter phone: ");
		Contact contact = new Contact(firstName, lastName, email, phone);
		System.out.println();
		System.out.println(contact.displayContact());
		
		
		
		
		System.out.println("Bye!");
		
		
	}

}
