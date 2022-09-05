import surprise.IBag;
import surprise.ISurprise;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

    private IBag container;
    private int waitTime;

    public AbstractGiveSurprises(String bagType, int waitTime) {
        BagFactoryOptimizeStorage bagFactory = new BagFactoryOptimizeStorage();
        this.container = bagFactory.makeBag(bagType);
        this.waitTime = waitTime;
    }

    @Override
    public String toString() {
        return "We gathered many presents. " + this.container + "";
    }

    public void put(ISurprise newSurprise) {
        this.container.put(newSurprise);
    }

    public void put(IBag surprises) {
        this.container.put(surprises);
    }

    public void put(ArrayList<ISurprise> surprises){
        for (int i = 0; i < surprises.size(); i++){
            this.container.put(surprises.get(i));
        }
    }

    public ISurprise give() {
        if (this.container.isEmpty()){
            return null;
        }
        giveWithPassion();
        ISurprise surpriza = this.container.takeOut();
        return surpriza;
    }

    public ArrayList<ISurprise> giveAll() {
        if (this.container.isEmpty()){
            return null;
        }
        ArrayList<ISurprise> surprises = new ArrayList<ISurprise>();
        int initialSize = this.container.size();
        for (int i = 0; i < initialSize; i++) {
            try {
                surprises.add(give());
                TimeUnit.SECONDS.sleep(10); // number of seconds to sleep
            } catch (InterruptedException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return surprises;
    }

    public boolean isEmpty() {
        return this.container.isEmpty();
    }

    abstract void giveWithPassion();

}