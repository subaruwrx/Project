package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Potatoes extends Garden {

    @Override
    public void collectSeeds() {
        System.out.println("buying potato seeds");

    }

    @Override
    public void plantSeeds() {
        System.out.println("putting the potato seeds in the ground");
    }

    @Override
    public void ripHaverst() {
        System.out.println("getting the potatoes planted");

    }
}
