/**
 * Created by Charles Engen on 12/6/2015.
 */
public class responsesText {

    public static String getResponse(responses response){
        switch (response){
            case WIN:
                return "\nYou have won the game";
            case DRAW:
                return "\nYou have has a draw.";
            case LOSE:
                return "\nYou have lost...";
            default:
                return "\nYou failed to make a valid choice!";
        }
    }

    public static String returnResponse(int playerResponse){
        switch (playerResponse){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "\nYou failed to make a valid choice!";
        }
    }
}
