/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	Card one = new Card("3", "Hearts", 3);
	Card two = new Card("2", "Spades", 3);
	Card three = new Card("3", "Hearts", 3);
	System.out.println("does one match 3 " + one.matches(three));
	System.out.println("Does one match 2 " + one.matches(two));    
	System.out.println("suit of card#1 " + one.suit());
	System.out.println("card#1 " + one.toString());
	}
}
