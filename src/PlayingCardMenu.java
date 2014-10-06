import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class PlayingCardMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayingCardMenu extends JMenuBar
{
	// instance variables - replace the example below with your own
    String[] gameItems = new String[] { "BlackJack" };

	/**
	 * Constructor for objects of class PlayingCardMenu
	 */
	public PlayingCardMenu()
	{
		// initialise instance variables
		JMenu gameMenu = new JMenu("Games");
		
		ActionListener gameListener = new ActionListener() {
		   public void actionPerformed(ActionEvent event) {
		      System.out.println("Game Item: " +event.getActionCommand() + " selected.\n");
		   }
		};
		
		for (int i = 0; i < gameItems.length; i++){
		    JMenuItem item = new JMenuItem(gameItems[i]);
		    item.addActionListener(gameListener);
		    gameMenu.add(item);
		}
		
		add(gameMenu);
	}
}
