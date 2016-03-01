package occ.cs272.ic05;
import java.awt.*;
import java.util.Random;

import javax.swing.*;

/**
 * CS 272 Exercises.
 * Introduction to event handling.
 * 
 * @author Stephen Gilbert
 * @version Spring 2016
 */

public class DotPanel extends JPanel
{
    /**
     * You'll put your GUI starter code in the constructor
     */
    public DotPanel()
    {
        setBackground(Color.yellow);
        Random rand = new Random();
        setLayout(null); // We'll talk about this later
        
        for (int i = 0; i < 50; i++)
        {
            Dot aDot = new Dot();
            add(aDot);
            aDot.setLocation(rand.nextInt(DEFAULT_WIDTH), 
                             rand.nextInt(DEFAULT_HEIGHT));
            aDot.setForeground(new Color(rand.nextInt()));
            aDot.setRadius(rand.nextInt(25) + 3);
        }
    }
    
    // Stuff you can customize
    private static String appName = "CS272 DotPanel";
    private static int DEFAULT_WIDTH = 600;
    private static int DEFAULT_HEIGHT = 400;
    
    /**
     * Generic main() method for Swing GUI App
     * @param args
     */
    public static void main(String[] args)
    {
        // Always start Swing programs on the event queue
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame mainFrame = new JFrame(appName);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.getContentPane().add(new DotPanel());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
            }
         });

    }

}
