package za.ac.cput.week5;

/**
 * Created by student on 2015/03/10.
 */
public class SmallAnimals extends Animal_Farm {

    public SmallAnimals()
    {
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
