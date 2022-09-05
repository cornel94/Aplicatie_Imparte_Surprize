public class Main {

    public static void main(String[] args) {

        GiveSurpriseAndApplause test1 = new GiveSurpriseAndApplause("RANDOM",2);
        test1.put(Candies.generate());
        test1.put(FortuneCookie.generate());
        test1.put(MinionToy.generate());

        GiveSurpriseAndApplause test2 = new GiveSurpriseAndApplause("LIFO",1);
        test2.put(Candies.generate());
        test2.put(FortuneCookie.generate());
        test2.put(MinionToy.generate());

        System.out.println(test1);
/*        System.out.println(test2);

        test1.put(GatherSurprises.gather(2));*/

        test1.giveAll();



/*        Candies candy = new Candies(10,"chocolate");
        candy.enjoy();
        FortuneCookie test2 = new FortuneCookie("portocale");
        test2.enjoy();*/


       /* TolbaRandom testare = new TolbaRandom();
        TolbaRandom testare2 = new TolbaRandom();

        testare.put(Candies.generate());
        testare2.put(FortuneCookie.generate());
        testare2.put(MinionToy.generate());
        testare.put(MinionToy.generate());
        testare.put(testare2);
        System.out.println(testare);
        System.out.println(testare2);

        BagFactoryOptimizeStorage testare3 = new BagFactoryOptimizeStorage();
        testare3.makeBag("FIFO");*/
    }
}
