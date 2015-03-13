package za.ac.cput.week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class Test_Factory {
    SportFactory sport;
    @Before
    public void setUp() throws Exception {

        sport=new SportFactory();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAdd() throws Exception {
        Sport sport1=sport.getType_Sport("Rugby");
        Sport sport2=sport.getType_Sport("Football");
        Assert.assertEquals("Catch ball and run",sport1.play());
        Assert.assertEquals("Trap ball and run",sport2.play());

    }
}
