import ui.Grade;
import utility.Console;

public class GradeConverter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y"))
		{
			
			int nGrade = Console.getInt("Enter Numerical grade");
			Grade grade = new Grade(nGrade);
			System.out.print("Letter Grade : ");
			System.out.println(grade.getLetter());
			
			choice = Console.getString("Continue? (y/n): ","y","n");
		

		}
		System.out.println("Bye");

	}

}
