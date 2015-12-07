import java.util.Random;

/**
 * Created by Charles Engen on 12/6/2015.
 */
public class aiPlay {

    public static int returnCPUGuess(){
        Random random = new Random();
        return random.nextInt(3 - 1) + 1;
    }
}
