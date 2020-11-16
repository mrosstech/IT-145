
public class Cat extends Pet {
	private int catSpaceNbr;
	private double catWeight;
	
	public Cat() {
		catSpaceNbr = 12;
		catWeight = 0.0;
	}
	
	public double getCatWweight() {
		return catWeight;
	}
	
	public void setCatWeight(double newCatWeight) {
		catWeight = newCatWeight;
	}
	
	public int getCatSpaceNbr() {
		return catSpaceNbr;
	}
	
	public void setCatSpaceNbr(int newCatSpaceNbr) {
		catSpaceNbr = newCatSpaceNbr;
	}
}
