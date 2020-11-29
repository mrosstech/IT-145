
public class Monkey extends RescueAnimal {
	public String species;
	public float tailLength;
	public float height;
	public float bodyLength;
	public float torso;
	public float skull;
	public float neck;
	
	
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
