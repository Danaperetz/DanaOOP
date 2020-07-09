
public class Table extends Furniture {

	private int numberOfSets;

	public Table(int length, int width, int highet, Color color, int numberOfSets) {
		super(length, width, highet, color);
		this.numberOfSets = numberOfSets;
	}

	public Table() {

	}

	public int getNumberOfSets() {
		return numberOfSets;
	}

	public void setNumberOfSets(int numberOfSets) {
		this.numberOfSets = numberOfSets;
	}

	@Override
	public String toString() {
		return "Table [numberOfSets=" + numberOfSets + ", toString()=" + super.toString() + "]";
	}

	public void display() {
		System.out.println("Table [numberOfSets=" + numberOfSets + ", toString()=" + super.toString() + "]");
	}

	public void draw() {
		System.out.println("   =====================");
		System.out.println("  /                   /");
		System.out.println(" /                   /|");
		System.out.println("===================== |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");

	}

}
