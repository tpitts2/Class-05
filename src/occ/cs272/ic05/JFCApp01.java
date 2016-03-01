package occ.cs272.ic05;

import javax.swing.*;

public class JFCApp01
{

    public static void main(String args[]) {
        
        JFrame frame = new JFrame("This is the simplest JFC app");
        
        frame.setSize(600, 500);
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
    
}
