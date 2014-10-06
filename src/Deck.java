
//package nate.games;

import java.util.*;

/**
 *  Class to model a deck of cards.
 *
 *@author     nate
 *@created    July 27, 2003
 */
public class Deck {

	private Stack cards = new Stack();
	private Card[] newDeck = new Card[52];
	private static Random rand = new Random();
	
	//The suits for the cards
	private final static String suits[] = {"Clubs", "Spades", "Hearts", "Diamonds"};

	//The values for the cards.
	private final static String values[] = {"Two", "Three", "Four", "Five", "Six",
			"Seven", "Eight", "Nine", "Ten", "Jack",
			"Queen", "King", "Ace"};


	/**
	 *  Constructor for the Deck object.
	 */
	public Deck() {
		//loop over the suits 0-3 with a nested loop over values 0-12
		//make a new Card and put it in a String[]
		int total = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				Card tempCard = new Card(suits[i], values[j]);
				newDeck[total] = tempCard;
				cards.push(tempCard);
				total++;
			}
		}
	}

	/**
	 *  Randomizes the order of the Deck.
	 */
	public void shuffle() {
		boolean[] picked = new boolean[newDeck.length];
		cards.clear();
		for (int i = 0; i < 52; i++) {
			int t;
			do {
				t = rand.nextInt(newDeck.length);
			} while (picked[t]);
			cards.push(newDeck[t]);
			picked[t] = true;
		}
	}
	/**
	 *  Debug method to print the deck.
	 */
	public void printDeck() {
		for (int i = 0; i < 52; i++) {
			System.out.println(cards.pop());
		}
	}


	/**
	 *  Returns the next card on the deck.
	 *
	 *@return    Card
	 */
	public Card draw() {
		return (Card) cards.pop();
	}

}
//end Class Deck

