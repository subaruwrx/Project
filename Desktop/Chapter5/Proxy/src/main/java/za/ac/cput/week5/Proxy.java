package za.ac.cput.week5;

import java.util.Date;

/**
 * Created by student on 2015/03/10.
 */
public class Proxy {

    SmallAnimals smallAnimals;

    public Proxy()
    {
        System.out.println("Feeding small animals at "+ new Date());
    }
    public void opening()
    {
        if(smallAnimals == null)
        {
            smallAnimals=new SmallAnimals();
        }
        smallAnimals.opening();
    }

}
