package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Model.LineItem;
import Model.Product;
import Model.Request;
import Model.User;
import Model.Vendor;
import util.Console;

public class PrsConsoleApp {
	private final String COMMAND_SHOW = "show";
	private final String COMMAND_ADD = "add";
	private final String GET_USER = "get";
	private static final String COMMAND_EXIT = "exit";
	
	
	
	public static void main(String[] args) {
		
		int uid;
		 String uname;
		 String upassword;
		 String fname;
		 String lname;
		 String uphone;
		 String uemail;
		
	System.out.println("Hello PRS");
	
	User u1 = new User(1, "DDonald", "Donald","Duck","PRS model class user", "222-111-4523","javanew@gmail.com", true, false);
	User u2 = new User(2, "SecondObject","fasterprgrm","JoyBliss","sky","223-456-1234","abc@hotmail.com",true, true);
	User u3 = new User(3, "KSonali","SunBright","Sonali","Bright","201-234-5674","sonali@abcd.com",true,false);
	
	//System.out.println(u1);
	//System.out.println(u2.toString());
	
	Request r1 = new Request(1,u1,"New Request","I need it", LocalDate.now(),"Pickup", "New", 0.0, 
			LocalDateTime.now(),null);
	
	Product p1 = new Product(1, 1, "P102","Pen",7.55,"number","http//abcd.html" );
	
	Vendor v1 = new Vendor(1, "V201","Vijetha","8805, Harper POint Drive","Cincinnati","OH","45249","513-293-8854","vijetha@gmail.com");
	
	LineItem L1 = new LineItem(1,1,1,5);
	
	
	
	//System.out.println("Request:");
	

	//System.out.println(r1.toString());
	
	List<User> users = new ArrayList<>();
	users.add(u1);
	users.add(u2);
	users.add(u3);
	String command = " ";
	
	while(!command.equalsIgnoreCase("COMMAND_EXIT"))
	{	
		
		System.out.println("==========================");
		System.out.println("User details");
		command = Console.getString("PLease enter show / add / get / exit");
		switch(command)
		{
				case "show": { 
								for (User u: users) {
									System.out.println(u); }
								break;
					 		 }
				
				case "add" : {
								uid = Console.getInt("Please enter UserID :");
								uname = Console.getString("Please enter User name :");
								upassword = Console.getString("Enter User password :");
								fname = Console.getString("Enter User First name :");
								lname = Console.getString("Enter User Last name :");
								uphone = Console.getString("Enter User phone :");
								uemail = Console.getString("Enter User email :");
								User ua = new User(uid,uname,upassword, fname, lname, uphone, uemail,false,false);
								users.add(ua);
								break;
								
							}
				case "exit" : {
								command = "COMMAND_EXIT";
								break;
								}
				case "get" :
							{
								int userId = Console.getInt("Enter userId");
								for(User a: users) {
									if (a.getId() == userId ) System.out.println(a);
								}
								break;
					
							}
				}
	
		}
	
	System.out.println("bye");
	}

	
}
