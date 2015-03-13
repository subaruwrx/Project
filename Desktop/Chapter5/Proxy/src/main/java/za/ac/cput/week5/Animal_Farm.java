package za.ac.cput.week5;

import java.util.Date;

/**
 * Created by student on 2015/03/10.
 */
public abstract class Animal_Farm {

    public void opening()
    {
        System.out.println(this.getClass().getSimpleName()+ " eat at" + new Date());
    }
}
