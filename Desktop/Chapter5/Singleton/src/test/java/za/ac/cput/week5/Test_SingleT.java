package za.ac.cput.week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */

public class Test_SingleT {

    private SIngleTon sin;
    @Before
    public void setUp() throws Exception {
        sin = SIngleTon.getInstance();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testSingle() throws Exception {

     Assert.assertEquals("Sibabalwe",sin.myName());



    }

}
