import surprise.IBag;
import surprise.IBagFactory;

public class BagFactoryOptimizeStorage implements IBagFactory {

    @Override
    public IBag makeBag(String type) {
        switch (type){
            case "FIFO":
                return new TolbaFIFO();
            case "LIFO":
                return new TolbaLIFO();
            case "RANDOM":
                return new TolbaRandom();
            default:
                System.out.println("This bag does not exist.");
                break;
        }
        return null;
    }
}
