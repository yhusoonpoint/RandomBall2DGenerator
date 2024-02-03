//imported java frameworks to handle specific queries
//File for handing file
//FileNOtFoundException to handle exception when a file isn't found
// PrintStream for printing file
// Array for using Arrays methods
//Random to use .nextInt method
//Scanner to read scanner Files.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Defining a Class
public class Ball2DIO {
    //Assigning values to two variable that are static private and final.
    private static final int x_Max = 500;
    private static final int y_Max = 500;

    //Method to generate a new file and fill it with a certain number certain number of coordinates.
    //throwing FileNotFoundException after the parameter because there's already one in the main Exercise, try and catch method could also be implemented.
    public static void writeRandomBall2D(String fileDest, int noOfBalls) throws FileNotFoundException
    {
        //Creating the file and opening it to add data inside
        PrintStream output = new PrintStream(fileDest);

        //Looping for the amount of coordinate needed.
        for(int i = 0; i < noOfBalls; i++)
        {
            //calling the Ball2D class to creat a Ball2D value into the file
            //did not assign a variable to Ball2D because i'm only calling it once
            //using next.Int to assign random value from 0 - the max value
            //Printing each value into the created file.
            output.println(new Ball2D(new Random().nextInt(x_Max+1),new Random().nextInt(y_Max+1)));
        }
        //closing the text file after it's done making sure the data is flushed
        output.close();
    }

    //Method to read the data from file and store it in a Ball2D array
    public static Ball2D[] readRandomBall2D(String fileSrc, int noOfLine) throws FileNotFoundException
    {
        //Reads the file given and opens it.
        Scanner input = new Scanner(new File(fileSrc));
        //Created a 2D array because i thought it was needed not realising it isn't
        int[][] tmp = new int[noOfLine][2];
        //This is assigned to 0 to loop through each array element.
        int i = 0;
        //Checking if there's any Line left and checking if the number i is less than the number of line to read
        //Going back to thinking i need to store each value read to a 2D array, i converted the split String Array  to a 2d int array.
        while (input.hasNextLine() && i < noOfLine) { tmp[i++] = Arrays.copyOf(Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray(), 2); }
        //closing file
        input.close();

        //creating a Ball2D array object
        Ball2D[]  convertedLines = new Ball2D[noOfLine];
        //resetting loop value to 0
        i = 0;
        //looping through the 2D array and store and creating a new Ball2D object for each x and y values
        for (int[] x : tmp) { convertedLines[i++] = new Ball2D(x[0],x[1]); }

        //returning the object variable.
        return convertedLines;
    }

}
