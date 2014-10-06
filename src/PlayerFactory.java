
/**
 * Write a description of class PlayerFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFactory
{
	// instance variables - replace the example below with your own
	protected String type;
	
	/**
	 * Constructor for objects of class PlayerFactory
	 */
	public PlayerFactory(String t)
	{
		// initialise instance variables
		type = t;
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param  y   a sample parameter for a method
	 * @return     the sum of x and y 
	 */
	public Player createPlayer()
	{
	    if (type.equals("BlackJack")){
	        return new BlackJackPlayer();
	    }
	    else {
	        System.out.println("Not a known player type");
	        return null;
	    }
	}
}
