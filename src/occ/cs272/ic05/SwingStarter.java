package occ.cs272.ic05;
import java.awt.*;

import javax.swing.*;

public class SwingStarter extends JPanel
{
    /**
     * You'll put your GUI starter code in the constructor
     */
    public SwingStarter()
    {
    }
    
    // Stuff you can customize
    private static String appName = "CS 272 Starter Application";
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
                mainFrame.getContentPane().add(new SwingStarter());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
            }
         });
    }
}
