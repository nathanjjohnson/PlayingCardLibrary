
//package nate.games;

/**
 *  Description of the Card Class
 *
 *@author     nate
 *@created    July 27, 2003
 */
public class Card {

	private String suit = null;
	private String value = null;


	/**
	 *  Constructor for the Card object
	 */
	public Card() { }


	/**
	 *  Constructor for the Card object
	 *
	 *@param  newSuit   The suit of the card.
	 *@param  newValue  The value of the card.
	 */
	public Card(String newSuit, String newValue) {
		suit = newSuit;
		value = newValue;
	}


	/**
	 *  Gets the suit attribute of the Card object
	 *
	 *@return    The suit value
	 */
	public String getSuit() {
		return suit;
	}


	/**
	 *  Gets the value attribute of the Card object
	 *
	 *@return    The value value
	 */
	public String getValue() {
		return value;
	}

	
	public String toString() {
		return value + " of " +suit+"\n";
	}
	
} //end Class Card

