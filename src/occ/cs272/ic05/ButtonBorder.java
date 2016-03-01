package occ.cs272.ic05;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * CS 272 Exercises.
 * Illustrates JButton with mnemonics, images, 
 * rollover images, and borders.
 * 
 * @author Stephen Gilbert
 * @version Spring 2016
 */

public class ButtonBorder extends JPanel
{
    /**
     * You'll put your GUI starter code in the constructor
     */
    public ButtonBorder()
    {
        JButton print = new JButton("Print", redIcon);
        JButton clear = new JButton("Clear", redIcon);

        // TODO: Set the pressed and rollover icons

        // Set the "hot keys" for the buttons
        print.setMnemonic(KeyEvent.VK_P);
        clear.setMnemonic(KeyEvent.VK_C);

        // Set the tooltip text for the buttons
        clear.setToolTipText("Erase the message");
        print.setToolTipText("Print a message");

        // Add the three widgets to the component pane
        add(print);
        add(clear);
        
        // Add the canvas to draw on
        DrawOn canvas = new DrawOn();
        canvas.setPreferredSize(new Dimension(150,150));
        add(canvas);

        // Hook up the event listeners
        print.addActionListener(canvas);
        clear.addActionListener(canvas);

        // Set the focus to the print button
        print.requestFocus();
    }

    /**
     * Named inner class to display messages and events
     */
    class DrawOn extends JComponent implements ActionListener
    {
        String command = "";

        /**
         * Create a TitledBorder around this component
         */
        public DrawOn()
        {
            setBorder(BorderFactory.createLineBorder(Color.RED));
            setBorder(new TitledBorder(
                        new MatteBorder(5,5,5,5,Color.blue),
                        "Greeting"));
        }

        /**
         * Repaint the screen with each button press.
         */
        public void actionPerformed(ActionEvent event)
        {
            command = event.getActionCommand();
            repaint();
        }

        /**
         * Actual code to paint the screen.
         */
        public void paintComponent(Graphics g)
        {
            if (command.equals("Print"))
            {
                g.drawString("Hi there",20,60);
                g.drawString("You just pressed",20,80);
                g.drawString("the print button.",20,100);
            }
        }
    }

    /**
     * Instance variables.
     */
    private RoundIcon greenIcon = new RoundIcon(Color.green.brighter(), 15);
    private RoundIcon whiteIcon = new RoundIcon(Color.white, 15);
    private RoundIcon redIcon   = new RoundIcon(Color.red, 15);
    
    
    // Stuff you can customize
    private static String appName = "CS272 ButtonBorder App";
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
                mainFrame.getContentPane().add(new ButtonBorder());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
                mainFrame.pack();
            }
         });
    }
}
