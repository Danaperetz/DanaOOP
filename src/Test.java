public class Test {

	public static Color whichColor() {
		int num = (int) (Math.random() * 3);

		switch (num) {
		case 0:
			return Color.WHITE;

		case 1:
			return Color.BLACK;

		case 2:
			return Color.RED;
		default:
			return null;
		}

	}

	public static boolean singleOrCouple() {
		int num = (int) (Math.random() * 2);
		boolean isTrueOrFalse = false;
		switch (num) {
		case 0:
			isTrueOrFalse = false;

			break;
		case 1:
			isTrueOrFalse = true;

			break;

		default:

			break;
		}

		return isTrueOrFalse;

	}

	public static void main(String[] args) {
		Furniture furniture[] = new Furniture[20];
		for (int i = 0; i < furniture.length; i++) {
			int num = (int) (Math.random() * 3);
			int length = (int) (Math.random() * 100) + 20;
			int width = (int) (Math.random() * 100) + 20;
			int highet = (int) (Math.random() * 100) + 20;
			Color color = whichColor();
			switch (num) {
			case 0:
				int numberOfSets = (int) (Math.random() * 4) + 2;
				furniture[i] = new Table(length, width, highet, color, numberOfSets);
				break;
			case 1:
				int numberOfLegs = (int) (Math.random() * 2) + 2;
				furniture[i] = new Chair(length, width, highet, color, numberOfLegs);
				break;
			case 2:
				boolean isTheBedSingle = singleOrCouple();
				furniture[i] = new Bed(length, width, highet, color, isTheBedSingle);
				break;
			default:
				System.out.println("Not Available");
				break;

			}
			// System.out.println(object[i]);
		}

		// System.out.println("------------------------------------------------------------------------------------");

		for (int i = 0; i < furniture.length; i++) {
			if (furniture[i] instanceof Chair) {

				((Chair) furniture[i]).display();
				((Chair) furniture[i]).draw();
				System.out.println("Number of legs: " + ((Chair) furniture[i]).getNumberOfLegs());

			}

			else if (furniture[i] instanceof Table) {

				((Table) furniture[i]).display();
				((Table) furniture[i]).draw();
				System.out.println("Number of sets: " + ((Table) furniture[i]).getNumberOfSets());

			} else if (furniture[i] instanceof Bed) {

				((Bed) furniture[i]).display();
				((Bed) furniture[i]).draw();
				System.out.println("The bed is for couple? " + ((Bed) furniture[i]).isTheBedSingle());

			}
		}
	}

}
