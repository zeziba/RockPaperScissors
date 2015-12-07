import java.util.Scanner;

/**
 * Created by Charles Engen on 12/6/2015.
 */
public class main {

    private static Boolean PLAYAGAIN = true;

    private static void start(){
        System.out.print("Welcome to the Java Rock, Paper, Scissors game.\n");
        while (PLAYAGAIN){
            playGame.play();
            System.out.print("\nWould you like to play again?.\n Enter 1: No\n");

            Scanner ask = new Scanner(System.in);
            String hold = ask.nextLine();
            try {
                if (Integer.parseInt(hold) == 1) {
                    PLAYAGAIN = false;
                }
            } catch (NumberFormatException e){
                System.out.print("Ok, let's play again\n");
            }
        }
    }

    public static void main(String[] args){
        start();
    }
}
