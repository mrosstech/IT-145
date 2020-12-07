import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double doubleTest = 0.0;
        String clearScanner = "";
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
        	try {
        		System.out.println("Enter wall height (feet): ");
        		wallHeight = scnr.nextDouble();
        		doubleTest = wallHeight / 2.0;    // Test to ensure no strings
        		if (doubleTest <= 0) {
        			throw new Exception("Height must be greater than zero!");
        		}
        	} 
        	catch (Exception excpt) {
        		System.out.println("Invalid Height!");
        		clearScanner = scnr.nextLine();   // Clear any remaining input.
        	}
        }  while (wallHeight <= 0);
        

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
        	try {
        		 System.out.println("Enter wall width (feet): ");
        	     wallWidth = scnr.nextDouble();
        	     doubleTest =  wallHeight / 2.0;  // Test to ensure no strings
        	     if (doubleTest <= 0) {
        	    	 throw new Exception("Width must be greater than zero!");
        	     }
        	     
        	}
        	catch (Exception excpt) {
        		System.out.println("Invalid Width!");
        		clearScanner = scnr.nextLine();   // Clear any remaining input.
        	}
        } while (wallWidth <= 0);
       

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " +  wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
