public class Startup {

	public static void main(String[] args) {
		double a, b, c;
		a = 0;
		b = 4;
		c = 4;
		Roots myRoots = new Roots(a, b, c);
		int numRoots = myRoots.getNumRoots();
		if (numRoots > 0) {
			System.out.println("There are " + myRoots.getNumRoots() + " roots.");
			System.out.println("The first root is " + myRoots.getRootOne() + ".");
			System.out.println("The second root is " + myRoots.getRootTwo() + ".");
		} else {
			System.out.println("There are no roots for the given values.");
		}
	}

}
