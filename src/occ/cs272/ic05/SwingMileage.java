package occ.cs272.ic05;

import java.awt.*;
import javax.swing.*;
import java.text.*;

/**
 * CS 272 Example program for JTextField.
 * Spring 2016
 */
public class SwingMileage extends JPanel
{
    // TODO: Initialize each using a different constructor
    private JTextField startMilesTF = null;
    private JTextField endMilesTF   = null;
    private JTextField fillupCostTF = null;
    private JTextField gallonsTF    = null;

    private JLabel milesPerGallonLbl = new JLabel("", JLabel.RIGHT);
    private JLabel costPerMileLbl    = new JLabel("", JLabel.RIGHT);

    // Formatters for both input and output
    private NumberFormat nfmt = NumberFormat.getInstance();
    private NumberFormat cfmt = NumberFormat.getCurrencyInstance();
    
    /**
     * Construct the user interface.
     */
    public SwingMileage()
    {
        // Set layout and border
        setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8));
        setLayout(new GridLayout(0, 2, 7, 7));
        
        // Add input items to the screen
        add(new JLabel("Beginning mileage :", JLabel.RIGHT));
        add(startMilesTF);
        add(new JLabel("Current mileage :", JLabel.RIGHT));
        add(endMilesTF);
        add(new JLabel("Cost of fill-up :", JLabel.RIGHT));
        add(fillupCostTF);
        add(new JLabel("Gallons purchased :", JLabel.RIGHT));
        add(gallonsTF);

        // Hook up the last textfield

        // Output area
        add(new JLabel("Miles per gallon :", JLabel.RIGHT));
        add(milesPerGallonLbl);
        add(new JLabel("Cost per mile :", JLabel.RIGHT));
        add(costPerMileLbl);

        milesPerGallonLbl.setFont(new Font("Serif", Font.BOLD, 14));
        costPerMileLbl.setFont(new Font("Serif", Font.BOLD, 14));
        milesPerGallonLbl.setForeground(Color.red);
        costPerMileLbl.setForeground(Color.red);
    }
    
    // Stuff you can customize
    private static String appName = "Calculate your Mileage";
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
                mainFrame.getContentPane().add(new SwingMileage());
                mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
                mainFrame.setVisible(true);
                mainFrame.pack();
            }
         });
    }
}
