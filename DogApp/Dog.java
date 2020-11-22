public class Dog {

    // instance variables
	String breed;
	String name;
	String type;
	String topTrick;
    // constructor
	public Dog(String newType, String newBreed, String newName) {
		
	}

    // methods


    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
