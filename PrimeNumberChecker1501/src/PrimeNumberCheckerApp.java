import java.util.ArrayList;

import utility.Console;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
	System.out.println("Welcome to Prime Number checker App");
	
	String choice = "y";
	
	while(choice.equalsIgnoreCase("y"))
	{
		
		ArrayList<Integer> factors = new ArrayList<>();
		int aNumber = Console.getInt("Please enter a number between 1 and 5000");
		boolean isprime = true;
		 for (int i = 2; i <= Math.sqrt(aNumber); i++) {
		        if (aNumber % i == 0) 
		        {
		        			isprime = false;
		        
		        }
		 }
		 if (!isprime ) {
			 System.out.println(aNumber+" is not a prime Number.");
			
			 for (int i=1;i<=aNumber; i++ )
	        	{
	        		if ( (aNumber % i) == 0)   
							factors.add(i);
	        	}
			 System.out.println("It has "+ factors.size()+" factors" + "\nFactors =  ");
	        	for(int i:factors) {
	    			System.out.print(" "+i);
	    		}
		 }
 		
		        else 
		        {
		        	System.out.println(aNumber+" is a prime number");
		        	
		        	System.out.println();
		        }		
		 System.out.println();
		 choice = Console.getString("Try again?");	
	}
	
	
System.out.println("Bye");
	}

}
