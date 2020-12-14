import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Driver {

    // instance variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();
    private static Scanner scnr = new Scanner(System.in);
    private static String userInput = "";

    public static void main(String[] args) {

        initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers

        
        // TODO: Remove.  Only for testing.
        //printCruiseList("details");
        //printShipList("active");
        
        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed
        do {
        	displayMenu();
        	userInput = scnr.nextLine();
        	
        	// Select the right action based on the users input
        	switch(userInput.toUpperCase()) {
        		case "1":
        			addShip(scnr);
        			break;
        		case "2":
        			editShip();
        			break;
        		case "3":
        			addCruise(scnr);
        			break;
        		case "4":
        			editCruise();
        			break;
        		case "5":
        			addPassenger(scnr);
        			break;
        		case "6":
        			editPassenger();
        			break;
        		case "A":
        			printShipList("name");
        			break;
        		case "B":
        			printShipList("active");
        			break;
        		case "C":
        			printShipList("full");
        			break;
        		case "D":
        			printCruiseList("list");
        			break;
        		case "E":
        			printCruiseList("details");
        			break;
        		case "F":
        			printPassengerList();
        			break;		
        	}
        	
        	// Clear the screen
        	System.out.println("\f");
        	
        } while (!userInput.equals("x"));
        
        

    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
        add("Candy Cane", 20, 40, 10, 60, true);
        add("Peppermint Stick", 10, 20, 5, 40, true);
        add("Bon Bon", 12, 18, 2, 24, false);
        add("Candy Corn", 12, 18, 2, 24, false);
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
    }

    // hardcoded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            System.out.println("\n\nSHIP LIST - Active");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList) {
            	if (eachShip.getInService()) {
            		eachShip.printShipData();
            	}
            }
        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip(Scanner scnr) {

    	String tempYN = "";
    	Ship newShip = new Ship();
    	
    	// Enter ship name.   Check ship name against all known ships.  If 
    	// ship name is already in database then prompt the user to enter
    	// the ship name again.
        do {
            System.out.println("Enter ship name: ");
            newShip.setShipName(scnr.nextLine());
            for (int x = 0; x < shipList.size(); x++) {
            	if (shipList.get(x).getShipName().equalsIgnoreCase(newShip.getShipName())) {
            		System.out.println("Ship name already in database.   Select another ship name!");
            		newShip.setShipName("");
            	}	
            }
        } while (newShip.getShipName() == "");
        
        newShip.setRoomBalcony(inputInteger("Enter number of Balcony Rooms:", scnr));
        newShip.setRoomOceanView(inputInteger("Enter number of Ocean View Rooms: ", scnr));
        newShip.setRoomSuite(inputInteger("Enter number of Suites: ", scnr));
        tempYN = inputYN("Ship in service? (Y/N): ", scnr);
        if (tempYN.equalsIgnoreCase("Y")) {
        	newShip.setInService(true);
        } else if (tempYN.equalsIgnoreCase("N")) {
        	newShip.setInService(false);
        }
        
        // Add ship to ship list after everything is verified
        shipList.add(newShip);
        
    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise(Scanner scnr) {
    	Cruise newCruise = new Cruise();
    	Boolean validShip = false;
    	
    	// Enter cruise name.  Check cruise name against all known cruises.  If
    	// cruise is already in the database then prompt the user to enter the 
    	// cruise name again.
    	do {
    		System.out.println("Enter cruise name: ");
    		newCruise.setCruiseName(scnr.nextLine());
    		for (int x = 0; x < cruiseList.size(); x++) {
    			if (cruiseList.get(x).getCruiseName().equalsIgnoreCase(newCruise.getCruiseName())) {
    				System.out.println("Cruise name already in database.  Select another cruise name!");
    				newCruise.setCruiseName("");
    			}
    		}
    	} while (newCruise.getCruiseName() == "");
        
    	do {
    		System.out.println("Enter cruise ship name (Enter [L] for list): ");
    		newCruise.setCruiseShipName(scnr.nextLine());
    		
    		// Print list of ships if user inputs 'L'
    		if (newCruise.getCruiseShipName().equalsIgnoreCase("L")) {
    			printShipList("full");
    			newCruise.setCruiseShipName("");
    		}
    		
    		// Validate that the ship name entered is a valid ship
    		for (int x = 0; x < shipList.size(); x++) {
    			if (newCruise.getCruiseShipName().equalsIgnoreCase(shipList.get(x).getShipName())) {
    				// If ship name matches, then set validShip to true
    				validShip = true;
    				// Break out of the loop because we found a match.
    				break;
    			}
    		}
    		if (!validShip) {
    			newCruise.setCruiseShipName("");
    		}
    	} while (newCruise.getCruiseShipName() == "");

        System.out.println("Enter departure port: ");
        newCruise.setDeparturePort(scnr.nextLine());
        System.out.println("Enter destination port: ");
        newCruise.setDestination(scnr.nextLine());
        System.out.println("Enter return port:");
        newCruise.setReturnPort(scnr.nextLine());
        
        // All data has been verified so add the new cruise to the cruise list.
        cruiseList.add(newCruise);
    }

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger(Scanner newPassengerInput) {
        // Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();
        Boolean validCruise = false;
        String newCruiseName = "";
        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        do {
        	System.out.println("Enter cruise name: ");
        	newCruiseName = newPassengerInput.nextLine();

	        // ensure cruise exists
	        for (Cruise eachCruise: cruiseList) {
	        	System.out.println("Comparing: " + eachCruise.getCruiseName() + " with " + newCruiseName);
	            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
	            	validCruise = true;
	            }
	        }
	        if (!validCruise) {
	        	System.out.println("This is not a valid cruise! Enter a valid cruise.");
	        }
        } while (!validCruise);

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }
    
    public static int inputInteger(String prompt, Scanner scnr) {
    	// Takes a prompt from the user and ensures a valid integer is returned.
    	int returnInt = 0;
    	Boolean caught = true;
    	
    	System.out.println(prompt);
    	do {
    		try {
    			caught = false;
    			returnInt = scnr.nextInt();
    		} catch (InputMismatchException e) {
    			scnr.next();
    			caught = true;
    			System.out.println("Enter a valid integer!");
    		}
    	} while (caught == true);   	
 
    	return returnInt;
    }
    public static String inputYN(String prompt, Scanner scnr) {
    	// Takes a prompt and ensures a valid Y or N is returned for yes or no questions.
    	String returnString = "";
    	Boolean caught = true;
    	System.out.println(prompt);
    	do {
    		try {
    			caught = false;
    			returnString = scnr.next();
    			if ((!returnString.equals("Y")) && (!returnString.equals("N"))) {
    				throw new InputMismatchException();
    			}
    		} catch (InputMismatchException e) {
    			scnr.next();
    			caught = true;
    			System.out.println("Enter a valid Y or N!");
    		}
    	} while (caught == true);
    	
    	return returnString;
    	
    }

}
