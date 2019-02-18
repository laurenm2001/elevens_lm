/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card newcard = new Card("Queen", "Hearts", 10);
		Card new2 = new Card("Queen", "Hearts", 10);
		System.out.println(newcard.rank());
		System.out.print(newcard.matches(new2));
	}
}
