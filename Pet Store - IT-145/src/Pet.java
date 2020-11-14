import java.util.Scanner;

public class Pet {
	
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue;
	private String grooming;
	
	public Pet() {
		petType = "";
		petName = "";
		petAge = 0;
		// For number of dog and cat spaces available we're just setting
		// them to 30 and 12 which is the number of spaces listed in the 
		// specification document.  If this were an actual program we might
		// have a database that we would query for the number of spaces
		// available when the class is instantiated or one which dynamically
		// updates the available spaces directly from the database.
		dogSpace = 30;
		catSpace = 12;
		daysStay = -1;
		amountDue = 0.0;
	}
	
	// Define accessors and mutators
	
	public String getPetType() {
		return petType;
	}
	
	public void setPetType(String newPetType) {
		petType = newPetType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String newPetName) {
		petName = newPetName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public void setPetAge(int newPetAge) {
		petAge = newPetAge;
	}
	
	public int getDogSpace() {
		return dogSpace;
	}
	
	public void setDogSpace(int newDogSpace) {
		dogSpace = newDogSpace;
	}
	
	public int getCatSpace() {
		return catSpace;
	}
	
	public void setCatSpace(int newCatSpace) {
		catSpace = newCatSpace;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public void setDaysStay(int newDaysStay) {
		daysStay = newDaysStay;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	
	public void setAmountDue(double newAmountDue) {
		amountDue = newAmountDue;
	}
	
	public String getGrooming() {
		return grooming;
	}
	
	public void setGrooming(String newGrooming) {
		grooming = newGrooming;
	}
	
	
	public void checkIn(int daysStay, String grooming ) {
		
		if(petType == "cat") {
			// Check the number of cat spaces available
			if(catSpace > 0) {
				// Cat spaces available so allocate 1 for this check-in
				catSpace -= 1;
			}	
			else {
				// No cat spaces available so return error
				// FIXME: Return some error here
				 return;
			}
		}
		if(petType == "dog") {
			// Check the number of dog spaces available
			if(dogSpace > 0) {
				// Dog spaces available so allocate 1 for this check-in
				dogSpace -=1;
			}
			else {
				// No dog spaces available so return error
				// FIXME: Return some error here
				return;
			}
		}
		// Check to see if this pet is a new pet.  If pet's age hasn't been set
		// then we'll assume it is a new pet.  We would probably want to store
		// some information about existing pets in a database and check against
		// that if this was really production but for now we'll make this 
		// assumption.
		if(petAge == 0) {
			// FIXME: Input all the pet's info.
			
		}
		else {
			// FIXME: Existing pet, allow update of pet's info
			
		}
		
		// FIXME: Input length of stay in days
		
		if (daysStay >= 2) {
			if (petType != "cat") {
				// This is not a cat so set the grooming attribute.
				// We could also skip the check above if the setGrooming
				// method was overloaded.  We could just create one that
				// sets the grooming attribute for dogs but then create
				// one for cats that just sets grooming to null or returns
				// nothing.
				this.setGrooming(grooming);
			}
		}
	}
	
	public void checkOut() {
		//FIXME: Add checkout logic here
	}
	
	public Pet getPet(String searchPetType, String searchPetName, int searchPetAge) {
		Pet tempPet = new Pet();
		return tempPet; //FIXME: Add Logic
	}
	
	public void createPet(String newPetType, String newPetName, int newPetAge) {
		petType = newPetType;
		petName = newPetName;
		petAge = newPetAge;
	}
	
	public void updatePet(String newPetType, String newPetName, int newPetAge) {
		petType = newPetType;
		petName = newPetName;
		petAge = newPetAge;
	}
}
