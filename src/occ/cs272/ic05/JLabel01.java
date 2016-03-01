package occ.cs272.ic05;
import java.awt.*;

import javax.swing.*;

/**
 * CS 272 Exercises.
 * Displays a few JLabels using different constructors
 *
 * @author Stephen Gilbert
 * @version Spring 2016
 */

public class JLabel01 extends JPanel
{
    /**
     * You'll put your GUI starter code in the constructor
     */
    public JLabel01()
    {
        // Set the panel background and the size of each label
        setBackground(new Color(196, 255, 196));
        Dimension labelSize = new Dimension(100, 100);

        // 1. A plain label (lab1) with centered text

        // 2. An image-only icon label named lab2 (use Car1.GIF)

        // Set the position of the icon in the bottom left of the label

        // 3. An image and text icon

        // Set the position of the icon 3 and the text
    }
    
    // Stuff you can customize
    private static String appName = "CS272 JLabel01";
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
                mainFrame.getContentPane().add(new JLabel01());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
            }
         });
    }
}
