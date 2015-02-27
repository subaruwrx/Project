package za.ac.cput.week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week4.Correct.Mini_bus;
import za.ac.cput.week4.Correct.Transport;
import za.ac.cput.week4.Correct.car;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/26.
 */
public class TestLsp_corr {
    private Transport trans =new car();
    private Transport v;
    @Before
    public void setUp() throws Exception {
        v = new Mini_bus();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testValid() throws Exception {
        Assert.assertEquals("Opening door",trans.openDoor());
        Assert.assertEquals("Opening door",v.openDoor());




    }

}
