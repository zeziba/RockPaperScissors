import java.util.Scanner;

/**
 * Created by Charles Engen on 12/6/2015.
 */
public class askPlayer {

    public static int getInput(){
        Scanner hold = new Scanner(System.in);
        int scanHold = hold.nextInt();
        System.out.print("You picked: " + responsesText.returnResponse(scanHold));
        return scanHold;
    }
}
