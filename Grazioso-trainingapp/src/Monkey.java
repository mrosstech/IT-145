import java.util.Scanner;

// IT-145 Project 2
// Michael Ross

public class Monkey extends RescueAnimal {
	private String species;
	private float tailLength;
	private float height;
	private float bodyLength;
	private float torso;
	private float skull;
	private float neck;
	
	public Monkey() {
		
	}
	
	public Monkey(String name, String type, String gender, int age, float weight, Boolean reserved, String acquisitionSource, String species, float tailLength, float height, float bodyLength, float torso, float skull, float neck) {
		super(name, type, gender, age, weight, reserved, acquisitionSource);
		this.species  = species;
		this.tailLength = tailLength;
		this.height	= height;
		this.bodyLength = bodyLength;
		this.torso = torso;
		this.skull = skull;
		this.neck = neck;
	}
	
    public void updateAnimal() {
    	super.updateAnimal();
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("New monkey species [" + this.species + "]: ");
    	this.species = scnr.next();
    	System.out.println("New monkey tail length [" + this.tailLength + "]: ");
    	this.tailLength = scnr.nextFloat();
    	System.out.println("New monkey height [" + this.height + "]: ");
    	this.height = scnr.nextFloat();
    	System.out.println("New monkey body length [" + this.bodyLength + "]: ");
    	this.bodyLength = scnr.nextFloat();
    	System.out.println("New monkey torso size [" + this.torso + "]: ");
    	this.torso = scnr.nextFloat();
    	System.out.println("New monkey skull size [" + this.skull + "]: ");
    	this.skull = scnr.nextFloat();
    	System.out.println("New monkey neck size [" + this.neck + "]: ");
    	this.neck = scnr.nextFloat();
    }
	
	// Accessors here:
	public String getSpecies() {
		return species;
	}
	public float getTailLength() {
		return tailLength;
	}
	public float getHeight() {
		return height;
	}
	public float getBodyLength() {
		return bodyLength;
	}
	public float getTorso() {
		return torso;
	}
	public float getSkull() {
		return skull;
	}
	public float getNeck() {
		return neck;
	}
	
	// Mutators here:
	public void setSpecies(String species)  {
		this.species = species;
	}
	public void setTailLength(float tailLength) {
		this.tailLength = tailLength;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setBodyLength(float bodyLength) {
		this.bodyLength = bodyLength;
	}
	public void setTorso(float torso) {
		this.torso = torso;
	}
	public void setSkull(float skull) {
		this.skull = skull;
	}
	public void setNeck(float neck) {
		this.neck =  neck;
	}
	
}
