//Require for graphics and JComponent
import javax.swing.*;
import java.awt.*;

//inheriting from JComponent
public class Ball2DDisplay extends JComponent {
    //private variable so over classed can't call it.
    private Ball2D[] ball2DRef;

    //Constructor to assign value to the above variable
    public Ball2DDisplay(Ball2D[] ball2DRef) {
        this.ball2DRef = ball2DRef;
    }

    //Overriding the paint component to draw what i want.
    @Override
    protected void paintComponent(Graphics graphics)
    {
        //looping through the given Array
        for(Ball2D x : ball2DRef)
        {
            //Assigning values to the graphic options using the Ball2D object Methods
            Graphics2D g = (Graphics2D) graphics;
            g.setColor(x.getC());
            g.fillOval(x.getX(), x.getY(), x.getRadius() * 2, x.getRadius() * 2);

        }
    }
}
