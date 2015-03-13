package za.ac.cput.week5;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class Test_State {
    Car car ;

    @Before
    public void setUp() throws Exception {
        car = new Car(new Drive_fast());

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testObserver() throws Exception {

        Assert.assertEquals("Drag racing",car.moveForward());
        Assert.assertEquals("reversing fast",car.reverse());
        car.setCarMovement(new Drive_slow());
        Assert.assertEquals("driving slow",car.moveForward());
        Assert.assertEquals("reversing slow",car.reverse());



    }
}
