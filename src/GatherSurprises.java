import surprise.ISurprise;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

    private static ArrayList<ISurprise> listaSurprize = new ArrayList<ISurprise>();
    private static Random rand = new Random();

    public static ISurprise gather(){
        ISurprise surpriza = null;
        switch (GatherSurprises.rand.nextInt(3)){
            case 0:
                surpriza = FortuneCookie.generate();
                break;
            case 1:
                surpriza = Candies.generate();
                break;
            case 2:
                surpriza = MinionToy.generate();
                break;
            default:
                break;
        }
        return surpriza;
    }

    public static ArrayList<ISurprise> gather(int n){
        GatherSurprises.listaSurprize.clear();
        for (int i = 0 ; i < n; i++){
            switch (GatherSurprises.rand.nextInt(3)){
                case 0:
                    GatherSurprises.listaSurprize.add(FortuneCookie.generate());
                    break;
                case 1:
                    GatherSurprises.listaSurprize.add(Candies.generate());
                    break;
                case 2:
                    GatherSurprises.listaSurprize.add(MinionToy.generate());
                    break;
                default:
                    break;
            }
        }
        return GatherSurprises.listaSurprize;
    }
}
