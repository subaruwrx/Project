package za.ac.cput.week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week4.Correct.Myname;
import za.ac.cput.week4.Correct.Srp_correct;
import za.ac.cput.week4.Violation.Name_age;
import za.ac.cput.week4.Violation.Srp;

/**
 * Created by student on 2015/02/24.
 */
public class Test_Invalid_way {
    private Srp r;
    @Before
    public void setUp() throws Exception {
        r = new Name_age();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testInvalid() throws Exception {

        Assert.assertEquals("Sibabalwe", r.name());
        Assert.assertEquals(25,r.age());

    }
}
