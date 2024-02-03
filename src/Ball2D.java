//imported to use Color type
import java.awt.*;

public class Ball2D
{
    //Four private variables
    private int x;
    private int y;
    private int radius;
    //imported java.awt.* to use this variable type 'Color'
    private Color c;

    //Constructor for the variables
    //x is the x coordinate and y is the y coordinate
    public Ball2D(int x, int y)
    {
        this.x = x;
        this.y =y;
        this.radius = 8;

        //Generated random Colors
        this.c = new Color((int)(Math.random() * 0x1000000));
    }

    //returning values based of their type.
    //Method to return x value
    public int getX() { return x; }
    //Method to return y value
    public int getY() { return y; }
    //Method to return radius value
    public int getRadius() { return radius; }
    //Method to return c value
    public Color getC() { return c; }

    //Overriding toString to print x and y with comma separating eg 3,2
    @Override
    public String toString() { return String.format(x + "," + y); }
}
