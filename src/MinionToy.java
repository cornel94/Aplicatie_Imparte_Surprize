import surprise.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MinionToy implements ISurprise {

    private String minionToyName;
    private static int minionCount = 0;

    public MinionToy (String minionToyName) {
        this.minionToyName = minionToyName;
    }

    @Override
    public void enjoy() {
        System.out.println("Your minion toy surprise is " + this.minionToyName + ".");

    }

    public static MinionToy generate() {
        ArrayList<String> toyNames = new ArrayList<String>(Arrays.asList(
                "Dave",
                "Carl",
                "Kevin",
                "Stuart",
                "Jerry",
                "Tim"));
        if (MinionToy.minionCount == toyNames.size()){
            MinionToy.minionCount = 0;
        }
        return new MinionToy(toyNames.get(MinionToy.minionCount++));
    }

    @Override
    public String toString(){
        return "A minion toy named " + this.minionToyName;
    }
}
