import java.util.ArrayList;
import java.util.List;

import utility.Console;

public class WizardInventoryApp {
	
	private static final String COMMAND_SHOW ="show";
	private static final String COMMAND_GRAB = "grab";
	private static final String COMMAND_EDIT = "edit";
	private static final String COMMAND_DROP = "drop";
	private static final String COMMAND_EXIT = "exit";
	

	public static void main(String[] args) {
		
		List<String> itemsList = new ArrayList<>();
		
		itemsList.add("Wooden staff");
		itemsList.add("wizard hat");
		itemsList.add("cloth shoes");
		
		String command = " ";
		
		while(!command.equalsIgnoreCase(COMMAND_EXIT)) 
		{
			System.out.println("\nThe Wizard Inventory game");
			System.out.println("\nCOMMAND MENU\n show - Show all items"
					+ "\n grab - Grab an item \n edit - Edit an item \n "
					+ "drop - Drop an item \n exit - Exit program ");
			
			command = Console.getString("Command : ");
			
				
				switch(command) {
				case COMMAND_SHOW:
						System.out.println("Show all items");
						for (String i:itemsList) { System.out.println((itemsList.indexOf(i)+1)+ " "+ i);}
						break;
				case COMMAND_GRAB:
					System.out.println("Grab an item");
					String name = Console.getString("Name");
					itemsList.add(name);
					break;
				case COMMAND_EDIT:
					System.out.println("Edit an item");
					break;
				case COMMAND_DROP:
					System.out.println("Drop an item");
					break;
				case COMMAND_EXIT:
					System.out.println("Exit app:");
					
					break;
				default :
					System.out.println("Invalid command");
						
				}
		}
		
		System.out.println("Bye");
	}

}
