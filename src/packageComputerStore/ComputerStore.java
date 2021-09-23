package packageComputerStore;
import packageComputer.Computer;
import packageComputerStore.MyFunctions;


import java.util.Scanner;



public class ComputerStore {
	
	public static void main(String[] args) {
		
		
		
		// declarations
		int maxComputer, choice;
		double price;
		boolean valid = false;
		String password="" ;
		String brand;
		
		
		
		final String PASSWORD = new String ("password");
		Scanner scanner = new Scanner(System.in);
		
		// display Title
		MyFunctions.displayTitle();	
		
		// set max number of computers
		maxComputer = MyFunctions.getMaxNumberOfComputers();
	
		// declaring the array of computers the store can contain;
		 Computer[] arrayInventory = new Computer[maxComputer];
		
		do {
			
			// display menu
			MyFunctions.dispalyMenu();
			
			// selecting a choice;
			choice = MyFunctions.selectAChoice(1,5);
			
			switch (choice) {
			case 1:
				System.out.println("Option 1");
				//validation check here	
				MyFunctions.checkValidation(password, PASSWORD, valid);	
				MyFunctions.addeComputersToStore(maxComputer, arrayInventory);
				break;		
			case 2:
				System.out.println("Option 2");
				//validation check here	
				MyFunctions.checkValidation(password, PASSWORD, valid);
				MyFunctions.performChange(arrayInventory, maxComputer);
				break;
			case 3:
				System.out.println("Option 3");
				// read brand
				brand = MyFunctions.readBrand();
				// search by brand
				MyFunctions.findComputersBy(brand, arrayInventory,maxComputer);
				break;
			case 4:
				System.out.println("Option 4");
				// reading price
				price = MyFunctions.readPrice();
				// display by price
				MyFunctions.findCheaperThan(price, arrayInventory,maxComputer);
				break;
			case 5:
				System.out.println("Option 5");
				// display classing message
				MyFunctions.displayClosingMessage();
				break;
				/*default:
				System.out.println("none");
				break;*/

			
			}
		} while (choice==1 ||choice == 2 || choice == 3 || choice == 4 || choice == 5);	
	}
}
