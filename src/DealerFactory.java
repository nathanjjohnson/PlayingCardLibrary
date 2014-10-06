
/**
 * Write a description of class DealerFactory here.
 * 
 * @author Nathan J. Johnson
 * @version 4/22/07
 */
public class DealerFactory
{
	// instance variables - replace the example below with your own
	protected String type;

	/**
	 * Constructor for objects of class DealerFactory
	 */
	public DealerFactory(String t)
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
	public Dealer createDealer()
	{
	    if (type.equals("BlackJack")){
	        return new BlackJackDealer();
	    }
	    else {
	        System.out.println("Not a known dealer type");
	        return null;
	    }
	}
}
