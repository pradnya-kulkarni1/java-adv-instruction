package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Model.Request;
import Model.User;

public class PrsConsoleApp {

	public static void main(String[] args) {
	System.out.println("Hello PRS");
	
	User u1 = new User(1, "tempObject", "omGuru","Babaji","PRS model class user", "222-111-4523","javanew@gmail.com", true, false);
	User u2 = new User(2, "SecondObject","fasterprgrm","JoyBliss","sky","223-456-1234","abc@hotmail.com",true, true);
	
	System.out.println("Users:");
	System.out.println("=============================");
	System.out.println(u1);
	System.out.println(u2.toString());
	
	Request r1 = new Request(1,u1,"New Request","I need it", LocalDate.now(),"Pickup", "New", 0.0, 
			LocalDateTime.now(),null);
	System.out.println("Request:");
	System.out.println("=============================");

	System.out.println(r1.toString());
	
	System.out.println("bye");
	}

}
