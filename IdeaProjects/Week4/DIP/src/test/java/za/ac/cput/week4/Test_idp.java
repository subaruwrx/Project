package za.ac.cput.week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week4.Correct.Emp_details;

/**
 * Created by student on 2015/02/26.
 */
public class Test_idp {
    private Emp_details emp;
    @Before
    public void setUp() throws Exception {
        emp = new Emp_details();

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testvalid() throws Exception {

        Assert.assertEquals("Sibabalwe",emp.name());
        Assert.assertEquals("Dike",emp.surname());

    }


}
