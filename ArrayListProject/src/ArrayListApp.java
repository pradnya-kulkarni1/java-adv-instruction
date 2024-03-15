import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		User u1 = new User();
		u1.setFirstname("Bob");
		User u2 = new User();
		u2.setFirstname("Mickey");
		User u3 = new User();
		u3.setFirstname("Donald");
	
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		
		evenNumbers.add(0);
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		evenNumbers.add(Integer.valueOf(8));
		
		for(int i:evenNumbers) {
			System.out.println("Even number :"+i);
		} // use of int is called auto boxing it automatically wrapps and unwrapps 
		
		List<User> users = new ArrayList<>(); // this is an example of polymorphism in Java
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		//users.add(u1);

		for (User u: users) {
			System.out.println(u);
		}
		
		
		System.out.println("Bye!!");

	}

}
