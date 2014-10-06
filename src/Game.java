
/**
 * Abstract class Game - This class represents a generic card game.
 * 
 * @author Nathan J. Johnson
 * @version 4/27/2007
 * 
 * 
 * ----------Threads----------
 * 1) New Game
 *    1a) Get a dealer; dealer gets a deck
 *    1b) Get players; How many?
 *    1c) Dealer deals;
 *    1d) Loop while players play their turns
 *    1e) Dealer plays his turn; game decided
 */
public abstract class Game
{
	// instance variables - replace the example below with your own
    DealerFactory dealerFactory;
    PlayerFactory playerFactory;
    
	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param  y	a sample parameter for a method
	 * @return		the sum of x and y 
	 */
	public String description()
	{
	    return "Generic Game";
	}
}
