package za.ac.cput.week4;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.week4.violation.Add;
import za.ac.cput.week4.violation.Sum;

/**
 * Created by student on 2015/02/27.
 */
public class Test_adp_vio {

    Add add=new Sum();
    @Test
    public void testValid() throws Exception {
        Assert.assertEquals(12, add.sum());


    }
}
