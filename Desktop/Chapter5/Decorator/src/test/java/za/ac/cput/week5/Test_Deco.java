package za.ac.cput.week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class Test_Deco {
    Car car;
    Car car1;
    @Before
    public void setUp() throws Exception {

        car= new SportsCar();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCommand() throws Exception {

        car.look();
        car=new WheelsDecorator(car);
        car.look();
        car=new DoorDecorator(car);
        car.look();

    }
    
}
