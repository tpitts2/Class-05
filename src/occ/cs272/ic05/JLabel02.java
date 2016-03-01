package occ.cs272.ic05;
import java.awt.*;

import javax.swing.*;

/**
 * CS 272 Exercises.
 * Using the ImageIcon class
 *
 * @author Stephen Gilbert
 * @version Spring 2016
 */

public class JLabel02 extends JPanel
{
    /**
     * You'll put your GUI starter code in the constructor
     */
    public JLabel02()
    {
        setLayout(new GridLayout(0, 1, 5, 5));

        // ImageIcon constructors
        // a. Local, same folder.
        ImageIcon ima = null; // Construct using "tiger.gif"

        // b. Remote using a URL: Mr. Gilbert at rest.
        ImageIcon imb = null;
        // Construct using URL "http://sgilbert.occ.cccd.edu/sg_ship.jpg"

        // c. Local or from a JAR file (anywhere in class path)
        ImageIcon imc = null;

        // JLabel constructors
        add(new JLabel(ima));
        add(new JLabel(imb, JLabel.TRAILING));
        add(new JLabel("Fearless Leader", imc, JLabel.LEADING));
    }
    
    // Stuff you can customize
    private static String appName = "CS272 JLabel02";
    private static int DEFAULT_WIDTH = 600;
    private static int DEFAULT_HEIGHT = 400;
    
    /**
     * Generic main() method for SwingGUI App
     * @param args
     */
    public static void main(String[] args)
    {
        // Always start Swing programs on the event queue
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame mainFrame = new JFrame(appName);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.getContentPane().add(new JLabel02());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
            }
         });

    }

}
