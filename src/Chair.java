
public class Chair extends Furniture {

	private int numberOfLegs;

	public Chair() {

	}

	public Chair(int length, int width, int highet, Color color, int numberOfLegs) {
		super(length, width, highet, color);
		this.numberOfLegs = numberOfLegs;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "Chair [numberOfLegs=" + numberOfLegs + ", toString()=" + super.toString() + "]";
	}

	public void draw() {
		System.out.println("  i______i");
		System.out.println("  I______I");
		System.out.println("  I      I");
		System.out.println("  I______I");
		System.out.println(" /      /I");
		System.out.println("(______( I");
		System.out.println("I I    I I");
		System.out.println("I      I");

	}

	public void display() {
		System.out.println("Chair [numberOfLegs=" + numberOfLegs + ", toString()=" + super.toString() + "]");
	}
}
