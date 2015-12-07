/**
 * Created by Charles Engen on 12/6/2015.
 */
public class compute_score {

    public static String computeScore(int one, int two){
        int hold = one - two;
        return responsesText.getResponse(determineGameWin(hold));
    }

    private static responses determineGameWin(int score){
        switch (score){
            case 0:
                return responses.DRAW;
            case -2:
                return responses.WIN;
            case 1:
                return responses.WIN;
            default:
                return responses.LOSE;
        }
    }


}
