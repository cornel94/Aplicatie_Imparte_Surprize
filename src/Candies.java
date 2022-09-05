import surprise.ISurprise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {

    private int noCandies;
    private String candyType;
    private static Random rand = new Random();
    private static ArrayList<String> candies = new ArrayList<String>(Arrays.asList(
            "chocolate",
            "vanilla",
            "fruit",
            "jelly"));

    public Candies (int noCandies, String candyType){
        this.noCandies = noCandies;
        this.candyType = candyType;
    }

    @Override
    public void enjoy() {
        System.out.println("Your surprise contains: " + this.noCandies + " " + this.candyType);
    }

    public static Candies generate() {
        return new Candies(Candies.rand.nextInt(10),Candies.candies.get(Candies.rand.nextInt(Candies.candies.size())));
    }

    @Override
    public String toString() {
        return "A bag of " + this.noCandies + " " + this.candyType + " candies.";
    }

}
