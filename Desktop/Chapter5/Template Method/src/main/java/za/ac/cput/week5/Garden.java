package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Garden {
    public final void makeGarden()
    {
        collectSeeds();
        plantSeeds();
        waterGarden();
        ripHaverst();
    }

    public abstract void collectSeeds();

    public abstract void plantSeeds();

    public void waterGarden()
    {
        System.out.println("Watering garden");
    }

    public abstract void ripHaverst();
}
