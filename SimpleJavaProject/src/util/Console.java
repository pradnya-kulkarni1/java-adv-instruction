package util;

import java.util.Scanner;

public class Console {
    
    private static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();  
    }
public static String getString(String prompt, String str1, String str2) {
    	
    	String str = " ";
    	boolean success = false;
    	
    	while(!success) {
    		str = getString(prompt);
    		if ((str.equalsIgnoreCase(str1)) || (str.equalsIgnoreCase(str2)))
    		{
    			success = true;
    			
    		}
    		else {
    			System.out.println("Invalid response. Please enter "+str1+" or "+ str2+".");
    		}
    	
    	
    	}
    	return str;
    	
    }
    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }

    public static int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " 
                        + min + " and less than " + max + ".");
            } 
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }

    public static double getDouble(String prompt, double min, double max) {
        while (true) {
            double value = getDouble(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                System.out.println("Error! Number must be greater than " 
                        + min + " and less than " + max + ".");
            } 
        }
    }
}