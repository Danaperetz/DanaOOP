
public class Bed extends Furniture {

	private boolean isTheBedSingle;

	public Bed() {

	}

	public Bed(int length, int width, int highet, Color color, boolean isTheBedSingle) {
		super(length, width, highet, color);
		this.isTheBedSingle = isTheBedSingle;
	}

	public boolean isTheBedSingle() {
		return isTheBedSingle;
	}

	public void setTheBedSingle(boolean isTheBedSingle) {
		this.isTheBedSingle = isTheBedSingle;
	}

	@Override
	public String toString() {
		return "Bed [isTheBedSingle=" + isTheBedSingle + ", toString()=" + super.toString() + "]";
	}

	public void draw() {
		System.out.println("   ||");
		System.out.println("   ||                   ||");
		System.out.println("||/||___                ||");
		System.out.println("|| /`   )____________||_/|");
		System.out.println("||/___ //_/_/_/_/_/_/||/ |");
		System.out.println("||(___)/_/_/_/_/_/_/_||  |");
		System.out.println("||     |_|_|_|_|_|_|_|| /|");
		System.out.println("||     | | | | | | | ||/||");
		System.out.println("||~~~~~~~~~~~~~~~~~~~||");
		System.out.println("||                   ||");
	}

	public void display() {
		System.out.println("Bed [isTheBedSingle=" + isTheBedSingle + ", toString()=" + super.toString() + "]");
	}
}
