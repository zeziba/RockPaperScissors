
/**
 * Created by Charles Engen on 12/6/2015.
 */
public class playGame {

    public static void play(){

        System.out.println("Please pick a move\n" +
                "1: " + responsesText.returnResponse(1) + " 2: "
                + responsesText.returnResponse(2) + " 3:" + responsesText.returnResponse(3));

        int player = askPlayer.getInput();
        int ai = aiPlay.returnCPUGuess();

        System.out.print(compute_score.computeScore(player, ai));
    }
}
