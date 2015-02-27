package za.ac.cput.week4;

import org.testng.Assert;
import org.testng.annotations.Test;

import za.ac.cput.week4.Correct.Add;
import za.ac.cput.week4.Correct.Minus;
import za.ac.cput.week4.Correct.Multiply;

/**
 * Created by student on 2015/02/26.
 */
public class Test_Plk {

    private Add plk=new Add();
    private Minus m = new Minus();
    private Multiply mul = new Multiply();




    @Test
    public void testValid() throws Exception {
        Assert.assertEquals(30,plk.add());
        Assert.assertEquals(-10,m.minus());
        Assert.assertEquals(200,mul.multy());
    }


}
