
/**
 * Write a description of class BlackJackDealer here.
 * 
 * ---------BlackJack Dealer Thread-------
 * 1) Shuffle
 * 2) Deal Game
 * 3) Deal Players
 * 4) Deal Self
 * 5) Decide Game
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackJackDealer extends Dealer
{
	// instance variables - replace the example below with your own
    Deck blackJackDeck;
	/**
	 * Constructor for objects of class BlackJackDealer
	 */
	public BlackJackDealer()
	{
		// initialize instance variables
		blackJackDeck = new Deck();
		blackJackDeck.shuffle();
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param  y   a sample parameter for a method
	 * @return     the sum of x and y 
	 */
     public String description()
     {
         return "BlackJack Dealer";
     }
}
