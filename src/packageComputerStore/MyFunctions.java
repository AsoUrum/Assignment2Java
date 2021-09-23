package packageComputerStore;
import packageComputer.Computer;

import java.util.Iterator;
import java.util.Scanner;



public class MyFunctions {
	
		// method to display title
			public static  void displayTitle() {
					
					System.out.println("\tWelcome to This Computer Store");
					System.out.println("\t===============================");
					System.out.println(" ");
				
				
					}

		// method to get the total  number of computers in the store capacity 		
			public static int getMaxNumberOfComputers() {
				int num;
				Scanner scanner = new Scanner(System.in);
	
				// requesting from user the  enter number of  computers
				 System.out.print("Please Enter the total  number of computers you store can contain:");
				 num = scanner.nextInt();
				// scanner.close();
				return num;
			}

		// method to get the number of computers to populate  the store		
			public static void addeComputersToStore(int max, Computer[] comp)    {
							int num;
							Scanner scanner = new Scanner(System.in);
							String brand, model;
							long sn;
							double price;
							
							int len = 0;
							// checking for empty space
							for (int i = 0; i < comp.length; i++) {
								if (comp[i]== null) {
									len++;
								}
							}
							
							Computer acomp;
							
								do {
									// requesting from user the number of  computers the user wants to populate the store with 
									 System.out.print("\n\nPlease Enter the number of computers your store can contain:");
									 num = scanner.nextInt();
									 
									 if (num >len) {
										
										 System.out.println("the number you entered is greater the the avalaible space");
									}else {
										
									
										 System.out.println("\n\nThank you, you can now enter the computer individually ");
										 break;
									}
									 
								} while (num > (max-len)|| num<=0);
								
								
									
									for (int i = 0; i < num; i++) {
										
										acomp = new Computer();
										System.out.println("Entery number "+ (i+1) +"\n");
								
										System.out.println("\nPlease enter brand");
										
										acomp.setBrand(scanner.next());
										
										System.out.println("\nPlease enter the model");
										
										acomp.setModel(scanner.next());
										
										System.out.println("\nPlease enter serial");
										
										acomp.setSn(scanner.nextLong());
										
										
										System.out.println("\nPlease enter the price ");
										
										acomp.setPrice(scanner.nextDouble());
									
										comp[i]= acomp;
										
									} 
									
								
												
						 System.out.println("Its  done, thanks for using our system");
								
					}

			
			
		// method to display menu
			public static void dispalyMenu() {
				String mainMenu;
				// assigning main menu
				mainMenu ="What do you want to do\n\t"
						+ "1.  Enter new computers \n\t"
						+ "2.  Change information of computer\n\t"
						+ "3.  Display all computer by specific brand\n\t"
						+ "4.  Dispaly all computers under a certain price.\n\t"
						+ "5.  Quit\n ";
				System.out.println(" ");
				System.out.println(mainMenu);
				System.out.println(" ");
			}
			
			
		// method to select a choice		
			public static int selectAChoice(int lower, int upper) {
				int choice;
				
				do {
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("Please enter your choice ==>> ");
					choice = scanner.nextInt();
					
				} while (choice < lower|| choice>upper);
				
				return choice;
				
			}

		
		// method to read password
			public static String readPassword() {
				Scanner scanner = new Scanner(System.in);
				String pw;
				//System.out.println("");
				System.out.print("Please Enter your password: ");
				pw = scanner.next();
				
				
				pw=pw.trim();
				
				return pw;
			}
			
			
		// method for validation password;	
			public static boolean validation(String pw, final String PW) {
				//System.out.println("");			
				boolean flag = false;
					flag = PW.equals(pw);
				return flag;
			}
			
		
		// method to repeat validation
			public static void checkValidation(String pw, final String PW, boolean valid){
				
				int count = 0;
				
				do {
					System.out.println(" Password try number : " + ( count + 1));
					pw = MyFunctions.readPassword();
					valid = MyFunctions.validation(pw, PW);
					if (valid == true) {
						
						System.out.println("welcome, password validated");
						break;	
					}else {
						
						count++;
						System.out.println("Wrong password, lets try again");	
					}
					
				} while ( count<3);	
			}
			
		
		//method to read brand
			public static String readBrand() {
				
				Scanner scanner = new Scanner(System.in);
				String astring;
				System.out.print("please enter a brand name: ");
				astring = scanner.next();
				
				return astring;
			}
			
			
		// method find  Computer by brand
			public static void findComputersBy(String brand, Computer[] arrayComp, int max) {			
				/*Computer com = new Computer();
				int len = com.findNumberOfCreatedComputers();	*/
				
					Computer com2;
					for (int i = 0; i < max /*len-1*/; i++) {
						com2 = new Computer();
						if((arrayComp[i].getBrand()).equals(brand)== true) {
						
							com2.setBrand(arrayComp[i].getBrand());
							com2.setModel(arrayComp[i].getModel());
							com2.setSn(arrayComp[i].getSn());
							com2.setPrice(arrayComp[i].getPrice());
							//System.out.println("\n\n");
							System.out.println("\n\n");
							System.out.println(com2.toString());
							System.out.println("\n\n");
						}					
				}
				
				
			}
			
			
			
		
		//method to read price
			public static double readPrice() {
				
				Scanner scanner = new Scanner(System.in);
				double aprice;
				System.out.print("please enter a price: ");
				aprice = scanner.nextInt();
				
				return aprice;
			}
			
		// method fine by price	
		public static void findCheaperThan(double price, Computer[] arrayComp,int max) {
			
			
			/*Computer com = new Computer();
			int len = com.findNumberOfCreatedComputers();
			*/
			
			Computer com2;
			for (int i = 0; i < max /*len-2*/; i++) {
				com2 = new Computer();
				if((arrayComp[i].getPrice()< price)) {
				
					com2.setBrand(arrayComp[i].getBrand());
					com2.setModel(arrayComp[i].getModel());
					com2.setSn(arrayComp[i].getSn());
					com2.setPrice(arrayComp[i].getPrice());
					//System.out.println("\n\n");
					System.out.println("\n\n");
					System.out.println(com2.toString());
					System.out.println("\n\n");
				}
				
				//System.out.println(com2.toString());
			}
		}
					
		// method to display closing message		
		 public static void displayClosingMessage(){
				
				
				System.out.println("\n\n\t\t\t----------THANK YOU  FOR USING OUR SERVICE. GOOD BYE.-----------");
				
				System.exit(0);
				
				
			}
			
		// method to read index
		
		public static int readIndex() {
				
				Scanner scanner = new Scanner(System.in);
				int index;
				System.out.print("please ente the index of the specific obeject: ");
				index = scanner.nextInt();
				
				return index;
			}
	
		// display menu 2
		
		public static void dispalyMenu2() {
			String mainMenu;
			// assigning main menu
			mainMenu ="What information would you like to change\n\t"
					+ "1.  Brand \n\t"
					+ "2.  Model\n\t"
					+ "3.  SN\n\t"
					+ "4.  Price\n\t"
					+ "5.  Quit\n ";
			System.out.println(" ");
			System.out.println(mainMenu);
			System.out.println(" ");
		}
		
		//method to read sn
		public static long readSn() {
			
			Scanner scanner = new Scanner(System.in);
			long sn;
			System.out.print("please enter a serial numner : ");
			sn = scanner.nextLong();
			
			return sn;
		}
		
		//method to read brand
		public static String readModel() {
			
			Scanner scanner = new Scanner(System.in);
			String model;
			System.out.print("please enter a model name: ");
			model = scanner.next();
			
			return model;
		}
		
		
		// method to perform change
		public static void performChange(Computer[] comp, int max) {
			 
			int index = readIndex();
			if (index > max-1) {
				System.out.println( "index is out of reange , try again");
				return;
				
			}
			int choice;
				
			
				if ( comp[index]== null) {
					
					System.out.println(" the index enterd is empty, do you wish to enter another index?");
					
					return;
					
				}
					
					System.out.println(comp[index].toString());
					
					
					do {
						dispalyMenu2();
						choice= selectAChoice(1,5);
						
						switch (choice) {
						case 1:
							System.out.println("Option 1");
							String brand =readBrand();
							comp[index].setBrand(brand);
							System.out.println(comp[index].toString());
							
							break;		
						case 2:
							System.out.println("Option 1");
							String model =readModel();
							comp[index].setModel(model);;
							System.out.println(comp[index].toString());
							
							break;
						case 3:
							System.out.println("Option 3");
							long sn = readSn();
							comp[index].setSn(sn);;
							System.out.println(comp[index].toString());
							break;
						case 4:
							System.out.println("Option 4");
							double price = readPrice();
							comp[index].setPrice(price);
							System.out.println(comp[index].toString());
							break;
						case 5:
							System.out.println("Option 5");
							// display classing message
							displayClosingMessage();
							break;
							/*default:
							System.out.println("none");
							break;*/
						}
							
						
					} while (choice==1 ||choice == 2 || choice == 3 || choice == 4 || choice == 5);
					
					
					
			
			
			
			
		}
		
		
		
		
}
