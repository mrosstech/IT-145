public class Dog {

    // instance variables
	String breed;
	String name;
	String type;
	String topTrick;
    // constructor
	public Dog(String newType, String newBreed, String newName) {
		type = newType;
		breed = newBreed;
		name = newName;
	}
	

    // methods
	public void setTopTrick(String newTrick) {
		topTrick = newTrick;
	}

    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is: " +
                topTrick + ".";
        return temp;
    }

}
