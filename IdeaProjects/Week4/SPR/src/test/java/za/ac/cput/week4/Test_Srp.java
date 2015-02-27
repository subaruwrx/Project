package za.ac.cput.week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week4.Correct.Myname;
import za.ac.cput.week4.Correct.Srp_correct;

/**
 * Created by student on 2015/02/24.
 */
public class Test_Srp {
    private Srp_correct nam;
    @Before
    public void setUp() throws Exception {
        nam = new Myname();


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCorrect() throws Exception {

        Assert.assertEquals("Sibabalwe",nam.name() );

    }



}
