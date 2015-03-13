package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Carrots extends Garden {
    @Override
    public void collectSeeds() {
        System.out.println("buying carrot seeds");

    }

    @Override
    public void plantSeeds() {
        System.out.println("putting the carrot seeds in the ground");
    }

    @Override
    public void ripHaverst() {
        System.out.println("getting the carrots planted");

    }
}
