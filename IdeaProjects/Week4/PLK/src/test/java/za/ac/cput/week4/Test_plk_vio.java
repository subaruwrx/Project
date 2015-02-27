package za.ac.cput.week4;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.week4.Violation.adding1;

/**
 * Created by student on 2015/02/27.
 */
public class Test_plk_vio {

    adding1 add=new adding1();
    @Test
    public void testValid() throws Exception {
        Assert.assertEquals(11, add.adding());

    }
}
