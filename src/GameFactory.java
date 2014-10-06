
/**
 * Write a description of class GameFactory here.
 * 
 * @author Nathan J. Johnson 
 * @version 4/22/07
 */
public class GameFactory
{
	// instance variables - replace the example below with your own
	protected String type;

	/**
	 * Constructor for objects of class GameFactory
	 */
	public GameFactory(String t)
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
	public Game createGame()
	{
	    if (type.equals("BlackJack")){
	        return new BlackJackGame(type);
	    }
	    else {
	        System.out.println("Not a known game type");
	        return null;
	    }
	}
}
