package occ.cs272.ic05;
import java.awt.*;

import javax.swing.*;

/**
 * CS 272 Exercises.
 * Create a few JButtons with different constructors.
 * 
 * @author Stephen Gilbert
 * @version Spring 2013
 */

public class JButton01 extends JPanel
{
    /**
     * You'll put your GUI starter code in the constructor
     */
    public JButton01()
    {
        setBackground(new Color(196, 196, 255));

        // 1. Create three JButtons
        JButton btn1 = null; // use the icon Car1.GIF
        JButton btn2 = null; // use a plain text phrase
        JButton btn3 = null; // use both some text and an image (Car2.GIF)

        // 2. Set hot-keys and & tooltips for JButtons
        // btn1 = F1, "Click here to order a blue car"
        // btn2 = Alt+P, "This is only text"
        // btn3 = Alt+1, "Anohter helpful message"

        // 3. Set the action commands for the buttons
        // Use Cut, Copy and Paste

        // 4. Want to hook up the buttons to event listener

        // 5. Add the buttons to the application
        add(btn1);
        add(btn2);
        add(btn3);
        add(outputLabel);
    }
    
    /**
     * Instance data.
     */
    private JLabel outputLabel = new JLabel("Output will appear here!!!");
    
    
    // Stuff you can customize
    private static String appName = "CS272 JButton02";
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
                mainFrame.getContentPane().add(new JButton01());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
            }
         });

    }

}
