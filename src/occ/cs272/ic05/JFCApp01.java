package occ.cs272.ic05;

import java.awt.EventQueue;

import javax.swing.*;

public class JFCApp01
{

    public static void main(String args[]) {

        EventQueue.invokeLater( new Runnable() {
            public void run() {
                JFrame frame = new JFrame("This is the simplest JFC app");

                frame.setSize(600, 500);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setVisible(true);
            }   
        });
    }

}
