
public abstract class Furniture {

	private int length;
	private int width;
	private int highet;
	private Color color;

	public Furniture(int length, int width, int highet, Color color) {
		super();
		this.length = length;
		this.width = width;
		this.highet = highet;
		this.color = color;
	}

	public Furniture() {
		super();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHighet() {
		return highet;
	}

	public void setHighet(int highet) {
		this.highet = highet;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Furniture [length=" + length + ", width=" + width + ", highet=" + highet + ", color=" + color + "]";
	}

	abstract void draw();

	abstract void display();
}
