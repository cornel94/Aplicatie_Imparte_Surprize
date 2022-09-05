import surprise.IBag;
import surprise.ISurprise;

import java.util.ArrayList;

public class TolbaLIFO implements IBag {

    private ArrayList<ISurprise> listaSurprize;

    public TolbaLIFO(){
        this.listaSurprize = new ArrayList<ISurprise>();
    }
    @Override
    public void put(ISurprise newSurprise) {

        this.listaSurprize.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        int initiallSize = bagOfSurprises.size();
        for (int i = 0; i < initiallSize; i++){
            this.listaSurprize.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        ISurprise surpriza = this.listaSurprize.get(this.listaSurprize.size() - 1);
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

    @Override
    public String toString(){
        return "The LIFO bag contains: " + this.listaSurprize;
    }
}
