
public class Dog extends Pet  {
	private int dogSpaceNbr;
	private int dogWeight;
	private String grooming;
	
	public Dog() {
		// Constructor for the Dog class
		dogSpaceNbr = 30;
		dogWeight = 0;
		grooming = "";
	}
	
	public String getGrooming() {
		// Return whether grooming is necessary or not.
		return grooming;
	}
	
	public void setGrooming(String newGrooming) {
		// Set the grooming state to true or false.
		grooming = newGrooming;
	}
	
	public int getDogWeight() {
		// Get the current weight of the dog in lbs.
		return dogWeight;
	}
	
	public void setDogWeight(int newWeight) {
		// Set the current weight of the dog in lbs.
		dogWeight = newWeight;
	}
	
	public int getDogSpaceNbr() {
		// Get the current dog space number.
		return dogSpaceNbr;
	}
	
	public void setDogSpaceNbr(int newDogSpaceNbr) {
		// Set the current dog space number.
		dogSpaceNbr = newDogSpaceNbr;
	}
	
}
