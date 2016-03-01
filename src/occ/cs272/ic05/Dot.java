package occ.cs272.ic05;

import java.awt.*;
import javax.swing.*;

/**
 *  Dot.java.
 *  CS 272 Exercise
 */
public class Dot extends JComponent
{
    private int radius;
    
    /**
     *  Set the default radius, and colors for each Dot. 
     */
    public Dot()
    {
        setRadius(10);
        setBackground(Color.green);
        setForeground(Color.red);
    }
    
    /**
     * Change the radius of the dot.
     * @param newRadius - new radius
     */
    public void setRadius(int newRadius)
    {
        radius = newRadius;
        setSize(radius * 2, radius * 2);
        setPreferredSize(getSize());
    }
    
    /**
     * Paints the component when its drawn.
     */
    public void paintComponent(Graphics g)
    {
        g.fillOval(0, 0, getWidth(), getHeight());
    }
}
