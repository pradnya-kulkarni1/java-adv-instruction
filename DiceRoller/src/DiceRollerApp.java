import util.Dice;
import util.Dice;
import utility.Console;

public class DiceRollerApp {

	public static void main(String[] args) {
	System.out.println("Welcome to the Dice Roller!");
	
	String choice = "";
		
		choice = Console.getString("Roll the Dice (y/n)?");
		while (choice.equalsIgnoreCase("y"))
		{
			Dice dice = new Dice();
			
			dice.roll();
			dice.printRoll();
			
			choice = Console.getString("Roll again? (y/n) ?");
		}
		System.out.println("Bye!");
	}

}
