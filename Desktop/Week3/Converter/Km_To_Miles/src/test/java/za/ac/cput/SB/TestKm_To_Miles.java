package za.ac.cput.SB;

/**
 * Created by student on 2015/02/19.
 */
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.SB.Kilo_impl.Kilo_imp;

import static junit.framework.TestCase.assertEquals;

public class TestKm_To_Miles
{
    private Kilo_Mile km;
    @Before
    public void setUp() throws Exception {
        km = new Kilo_imp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testKm_To_Miles() throws Exception {

        assertEquals(3.106855, km.km_To_Mile(5.00,0.621371));
        System.out.println("5 km = "+km.km_To_Mile(5.00,0.621371)+" Miles ");


    }
}
