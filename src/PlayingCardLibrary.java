import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;        

public class PlayingCardLibrary {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        //setBackground( new Color(130,50,40) );

        //Create and set up the window.
        JFrame frame = new JFrame("PlayingCardLibrary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

	   GameFactory gameFactory;
	   gameFactory = new GameFactory("BlackJack");
	   Game game = gameFactory.createGame();
	   //System.out.println("Your dealer is a: " + dealer.description());

        //Display the window.
        frame.setJMenuBar(new PlayingCardMenu());
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}