package occ.cs272.ic05;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class JotPad extends JPanel
{
    /**
     * You'll put your GUI starter code in the constructor
     */
    public JotPad()
    {
        // TODO: add scrolling with vertical scroll bar

        // TODO: turn on word wrapping


        // Set the layout and add the component
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        setLayout(new BorderLayout(4, 4));
        add(ta);
    }

    // TODO: Initialize each using a different constructor
    private JTextArea ta = new JTextArea(); // null;

    
    // Stuff you can customize
    private static String appName = "Jot Your Thoughts";
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
                mainFrame.getContentPane().add(new JotPad());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
            }
         });
    }
}
