import surprise.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {

    private String message;

    public FortuneCookie(String message) {
        this.message = message;
    }

    @Override
    public void enjoy() {
        System.out.println("Fortune cookie message is: " + this.message + ".");
    }

    @Override
    public String toString(){
        return "A fortune cookie stating: " + message + "";
    }
    public static FortuneCookie generate() {
        Random rand = new Random();
        ArrayList<String> mesaje = new ArrayList<String>(Arrays.asList(
                "Do it scared",
                "Look how far you've come",
                "Don’t hold onto things that require a tight grip",
                "I didn’t come this far to only come this far",
                "Every good and perfect gift is from above",
                "Little by little, one travels far",
                "Well behaved women seldom make history",
                "There is always something left to love",
                "We don't stop going to school when we graduate",
                "I am not afraid of storms, for I am learning how to sail my ship"));
        return new FortuneCookie(mesaje.get(rand.nextInt(10)));
    }
}
