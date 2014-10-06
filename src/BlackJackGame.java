
/**
 * Write a description of class BlackJackGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * ----------Threads----------
 * 1) New Game
 *    1a) Get a dealer; dealer gets a deck
 *    1b) Get players; How many?
 *    1c) Dealer deals;
 *    1d) Loop while players play their turns
 *    1e) Dealer plays his turn; game decided
 */
public class BlackJackGame extends Game
{

    static final int MAX_PLAYERS = 4;

    // instance variables - replace the example below with your own
    Dealer dealer;
    
    //an array of players
    BlackJackPlayer[] players;

    
    
	/**
	 * Constructor for objects of class BlackJackGame
	 */
	public BlackJackGame(String type)
	{
	   dealerFactory = new DealerFactory(type);
	   dealer = dealerFactory.createDealer();
	   
	   playerFactory = new PlayerFactory(type);
	   
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param  y   a sample parameter for a method
	 * @return     the sum of x and y 
	 */
	public String description()
	{
        return "BlackJack Game";
	}
}
