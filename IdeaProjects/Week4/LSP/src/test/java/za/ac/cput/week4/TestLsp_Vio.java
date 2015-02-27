package za.ac.cput.week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week4.Correct.Mini_bus;
import za.ac.cput.week4.Correct.Transport;
import za.ac.cput.week4.Correct.car;
import za.ac.cput.week4.violation.Type_vehicle;
import za.ac.cput.week4.violation.carVio;
import za.ac.cput.week4.violation.caterpillarVio;

/**
 * Created by student on 2015/02/26.
 */
public class TestLsp_Vio {
    private Type_vehicle trans;

    {
        trans = new carVio();
    }

    private  Type_vehicle v;
    @Before
    public void setUp() throws Exception {
        v = new caterpillarVio();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testValid() throws Exception {
        Assert.assertEquals("driving", trans.drive());
        Assert.assertEquals("Catter piller digging a hole",v.cat_Digging());




    }

}
