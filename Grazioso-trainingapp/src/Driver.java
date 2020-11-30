import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;


// IT-145 Project 2
// Michael Ross

public class Driver {

    public static void main(String[] args) {
    	
    	String menuInput = "";
    	Scanner scnr = new Scanner(System.in);
    	SimpleDateFormat myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    		

    	// RescueAnimal ArrayList for holding our dogs and monkeys
    	ArrayList<RescueAnimal> testAnimals = new ArrayList<RescueAnimal>();

        // Create New Dog for testing
    	Dog newDog = new Dog("Fluffy", "Hunting", "Female", 5, 50.50f, false, "Dog Pound", "Malamute");
    	newDog.setAcquisitionDate(LocalDateTime.now());
    	newDog.setTrainingStatus("in service");
    	newDog.setTrainingLocation("Japan");
    	
        // Create New Monkey for testing
    	Monkey newMonkey = new Monkey("Bobo", "Service", "Male", 10, 32.1f, false, "Jungles of Borneo", "Capuchin", 10.5f, 32.0f, 50.8f, 22.1f, 10.8f, 17.0f);
    	newMonkey.setAcquisitionDate(LocalDateTime.now());
    	newMonkey.setTrainingStatus("intake");
    	newMonkey.setTrainingLocation("Japan");
    	
    	
    	// Load test animals into the arraylist
    	testAnimals.add(newDog);
    	testAnimals.add(newMonkey);
 
        // Method(s) to update information on existing animals.  The updateAnimal method is defined
    	// per subclass  and on the parent class.
    	//testAnimals.get(0).updateAnimal();
    	//testAnimals.get(1).updateAnimal();
        
    	// Main system loop.  Keep this displayed while the selection is not 'Q'
    	do {
    		menuInput = "";
    		System.out.println("Enter a selection: ");
    		System.out.println("[R]equest an animal for in-service");
    		System.out.println("[D]isplay animal matrix by location and status");
    		System.out.println("[A]dd animal");
    		System.out.println("R[E]tire animal");
    		System.out.println("[O]utput reports");
    		System.out.println("Display In-[S]ervice Animals");
    		System.out.println("[Q]uit");
    		menuInput = scnr.next();
    		switch(menuInput) {
    			case "R":
    				processAnimalPlacement(testAnimals);
    				break;
    			case "D":
    				findAnimals(testAnimals);
    				break;
    			case "A":
    				addAnimal(testAnimals);
    				break;
    			case "E":
    				retireAnimal(testAnimals);
    				break;
    			case "O":
    				outputAnimalReport(testAnimals);
    				break;
    			case "S":
    				displayInServiceAnimals(testAnimals);
    				break;
    		}
    		
    		// Clear the screen after each iteration
        	System.out.println("\f");
    		
    	} while (menuInput != "Q");  // Exit the loop if Q is selected.
    

    }
    
    
    // Method to process placement request for a rescue animal  FULLY IMPLEMENTED -- GRADE THIS ONE
    static void processAnimalPlacement(ArrayList<RescueAnimal> animals) {
    	// Initialize the input variable  to -1 to avoid any issues with the selection loop below
    	int input = -1;
    	String temp = "";
    	// Get a scanner object for input
    	Scanner scnr = new Scanner(System.in);
    	
    	// Display a prompt to the user to select an appropriate animal to put in service.
    	System.out.println("Select animal to be placed[0-" + (animals.size()  - 1) + "]");
    	
    	animals.get(0).displayAnimalHeader();
    	// Loop through all known animals to see which animals are appropriate to put into service.
    	for (int x = 0; x < animals.size(); x++) {
    		
    		// Examine the animal to ensure it is not reserved and that it is out of training.  If
    		// not then we don't want it shown as a selection.
    		if (animals.get(x).getReserved() == false && animals.get(x).getTrainingStatus() == "in service") {
    			//System.out.println("[" + x + "] " + animals.get(x).getName() + " " + animals.get(x).getClass().getName());
    			System.out.print("[" + x + "] ");
    			animals.get(x).displayAnimal();
    		}   		
    	}
    	
    	//  Get the users input.  But only valid input.
    	do {
    		input = scnr.nextInt();
    	} while (input < 0 && input > animals.size() - 1);
    	
    	scnr.nextLine();
    	//  When the user selects a valid animal, prompt the user for the relevant placement info
    	System.out.println("For animal "  + animals.get(input).getName() + " what are: ");
    	System.out.print("In service country: ");
    	animals.get(input).setInServiceCountry(scnr.nextLine());
    	System.out.print("In service city: ");
    	animals.get(input).setInServiceCity(scnr.nextLine());
    	System.out.print("In service agency: ");
    	animals.get(input).setInServiceAgency(scnr.nextLine());
    	System.out.print("In service POC: ");
    	animals.get(input).setInServicePOC(scnr.nextLine());
    	System.out.print("In service e-mail: ");
    	animals.get(input).setInServiceEmail(scnr.nextLine());
    	System.out.print("In service phone num: ");
    	animals.get(input).setInServicePhone(scnr.nextLine());
    	System.out.print("In service postal address: ");
    	animals.get(input).setInServicePostalAddress(scnr.nextLine());
    	
    	// Output a success message
    	System.out.println(animals.get(input).getName() + " successfully set in service!");
    }
    
    // Method to 
    static void findAnimals(ArrayList<RescueAnimal> animals) {
    	String location;
    	String status;
    	Scanner scnr = new Scanner(System.in);
    	System.out.print("Enter location for search: ");
    	location = scnr.nextLine();
    	System.out.print("Enter status for search: ");
    	status = scnr.nextLine();
    	animals.get(0).displayAnimalHeader();
    	for (int x = 0; x < animals.size(); x++) {
    		if ((animals.get(x).getTrainingLocation() == location) && (animals.get(x).getTrainingStatus() == status)) {
    			// System.out.println("[" + x + "] " + animals.get(x).getName() + ", " + animals.get(x).getType() + ", " + animals.get(x).getGender() + ", " + animals.get(x).getAge() + ", " + animals.get(x).getWeight());
    			animals.get(x).displayAnimal();
    		}
    	}
    	System.out.println("Search complete... press any key to continue...");
    	scnr.next();
    }
    
    // Method to create a new animal and add it to the active animal ArrayList
    static void addAnimal(ArrayList<RescueAnimal> animals) {
    	// TODO:  Add addAnimal Logic
    	System.out.println("TODO: Not implemented");
    }
    
    // Method to retire an animal by setting its status to 'retired'
    static void retireAnimal(ArrayList<RescueAnimal> animals) {
    	// TODO: Add retireAnimal Logic
    	System.out.println("TODO: Not implemented");
    }
    
    // Method to output an animal report to third party agencies
    // Would need to loop through the active animal ArrayList and format the output
    static void outputAnimalReport(ArrayList<RescueAnimal> animals) {
    	// TODO: Add outputAnimalReport Logic
    	System.out.println("TODO: Not implemented");
    }
    
    // Method to display a list of in-service animals.   Loop through the active animal ArrayList and display the animals
    // that are marked as a status of 'in service' using the displayAnimal and displayAnimalHeader methods.
    static void displayInServiceAnimals(ArrayList<RescueAnimal> animals) {
    	// TODO: Add displayInServiceAnimals Logic
    	System.out.println("TODO: Not implemented");
    }
}
