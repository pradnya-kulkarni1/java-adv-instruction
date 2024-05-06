package ui;

import java.util.ArrayList;

import db.UserDb;
import db.VendorDb;
import model.Vendor;
import utili.Console;

public class PrsConsoleJdbcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS JDBC Console App");
		// 1 - Get All Users
		
//		ArrayList<User> users = UserDb.getAll();
//		if(users!=null) {
//			System.out.println("List of Users: ");
//			System.out.println("======================================");
//			for(User u: users) {
//				System.out.println(u);
//			}
//		}
//		else {
//			
//			System.out.println("Error - check logs");
//		}
//		
//		System.out.println("Get User by Id (3)");
//		
//		User user = UserDb.getById(3);
//		
//		if(user!= null) {
//			
//			System.out.println(user);
//		}
//		else {
//			System.out.println("Error - check logs");
//		}
//		
		
//		System.out.println("Add a user");
//		User u = new User(0,"tuser","Jumbo","saminamina","mickey","234-123-4534","jumbo@gmail.com",false, true);
//		if (UserDb.add(u)) {
//			System.out.println("Success - user added.");
//		}
//		else {
//			System.out.println("Error adding user");
//		}
//		
//		System.out.println("Delete a user");
//		
//		if(UserDb.delete(7)) {
//			System.out.println("User 4 deleted");
//		}
//		else
//		{
//			System.out.println("Error deleteing User.");
//		}
//		
		//Get all Vendors
		ArrayList<Vendor> vendors = VendorDb.getAll();
		if(vendors!=null) {
			System.out.println("List of Vendors: ");
			System.out.println("======================================");
			for(Vendor v: vendors) {
				System.out.println(v);
			}
		}
		else {
			
			System.out.println("Error - check logs");
		}
		String choice ="y";
		while(choice.equalsIgnoreCase("y")) {
				System.out.println("Add a vendor");
				
				Vendor v = createVendor();
				
				if (VendorDb.add(v)) {
					System.out.println("Success - Vendor added.");
				}
				else {
					System.out.println("Error adding vendor");
				}
			choice = Console.getString("Continue? y/n","y","n");	
		}
		System.out.println("GoodBye!!");

	}
	
	private static Vendor createVendor()
	{
		String code;
		 String name;
		 String address;
		 String city;
		 String state;
		 String zip;
		 String phone;
		 String email;
		
		code = Console.getString("Enter Code");
		 name = Console.getString("Enter Name");
	 address = Console.getString("Enter Address");
		 city = Console.getString("Enter City");
		state = Console.getString("Enter State");
		 zip = Console.getString("Enter zip");
		 phone = Console.getString("Enter phone");
		 email = Console.getString("Enter Email");
		 
		Vendor vn = new Vendor(0,code,name,address,city,state,zip,phone,email);
		return vn;
		
	}

}
