import surprise.IBag;
import surprise.ISurprise;
import java.util.ArrayList;
import java.util.Random;

public class TolbaRandom implements IBag {

    private ArrayList<ISurprise> listaSurprize;
    private Random randomGen;

    public TolbaRandom(){
        this.listaSurprize = new ArrayList<ISurprise>();
        this.randomGen = new Random();
    }

    @Override
    public String toString() {
        return "The random bag contains: " + listaSurprize + ". ";
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.listaSurprize.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        int initialBagOfSurprise = bagOfSurprises.size();
        for (int i = 0; i < initialBagOfSurprise; i++){
            this.listaSurprize.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        ISurprise surpriza = this.listaSurprize.get(this.randomGen.nextInt(this.listaSurprize.size()));
        this.listaSurprize.remove(surpriza);
        surpriza.enjoy();
        return surpriza;

    }

    @Override
    public boolean isEmpty() {
        if (this.listaSurprize.size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.listaSurprize.size();
    }
}
