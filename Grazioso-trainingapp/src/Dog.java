import java.util.Scanner;
// IT-145 Project 2
// Michael Ross

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog() {
    }
    
    public Dog(String name, String type, String gender, int age, float weight, Boolean reserved, String acquisitionSource, String breed) {
    	super(name, type, gender, age, weight, reserved, acquisitionSource);
    	this.breed = breed;
    }
    
    @Override
    public void updateAnimal() {
    	super.updateAnimal();
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("New dog breed [" + this.breed + "]: ");
    	this.breed = scnr.next();
    }
    
    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
