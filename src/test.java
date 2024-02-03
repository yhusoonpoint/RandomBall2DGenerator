import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test
{
    public static void main(String[] args) throws FileNotFoundException {

        Ball2D[] i = Ball2DIO.readRandomBall2D("test1",6);
        for (Ball2D x : i)
        {
            System.out.println(x);
        }


       /* Scanner input = new Scanner(new File("test1"));
        int[][] tmp = new int[6][2];
        String curLine;
        int i = 0;
        while (input.hasNextLine() && i < 6) {

            curLine = input.nextLine();

            tmp[i++] = Arrays.copyOf(Arrays.stream(curLine.split(",")).mapToInt(Integer::parseInt).toArray(), 2);
        }
        i=0;
        int[] t = new int[12];
        for (int[] x : tmp)
        {
            for (int y : x)
            {
                t[i++] = y;
            }
            System.out.println();
        }




        for (int x : t)
        {
            //System.out.println(x);
        }*/

    }
}
