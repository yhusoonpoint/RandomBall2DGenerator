import javax.swing.*;
import java.io.FileNotFoundException;

public class MyMain {
    //main method to display program.
    public static void main(String[] args)
    {
        //Try and catch statement to prevent program from crashing if any error is spotted.
        try
        {
            //Creating a file and filling it with 10 coordinates
            Ball2DIO.writeRandomBall2D("test2", 10);
            //Creating a JFrame for the drawing and assigning size.
            JFrame f = new JFrame("Ball2D Display");
            f.setSize(500, 500);
            //Adding each coordinating to draw
            f.add(new Ball2DDisplay(Ball2DIO.readRandomBall2D("test2", 10)));
            //Making sure program terminates when window is closed.
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //displaying the form and drawing
            f.setVisible(true);
        }
        catch (FileNotFoundException e)
        {
            //Printing the File error catch.
            e.printStackTrace();
        }
    }
}
