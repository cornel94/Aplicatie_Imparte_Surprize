import surprise.IBag;
import surprise.ISurprise;

import java.util.ArrayList;

public class TolbaFIFO implements IBag {

    private ArrayList<ISurprise> listaSurpize;
    private int counter = 0;

    public TolbaFIFO(){
        this.listaSurpize = new ArrayList<ISurprise>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.listaSurpize.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        int initialSize = bagOfSurprises.size();
        for (int i = 0; i < initialSize; i++){
            this.listaSurpize.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        ISurprise surpriza = this.listaSurpize.get(0);
        this.listaSurpize.remove(surpriza);
        surpriza.enjoy();
        return surpriza;
    }

    @Override
    public boolean isEmpty() {
        if (this.listaSurpize.size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.listaSurpize.size();
    }

    @Override
    public String toString(){
        return "The FIFO bag contains: " + this.listaSurpize;
    }
}
