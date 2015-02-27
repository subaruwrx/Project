package za.ac.cput.week4;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/23.
 */
public class Test_display {


    @Test
    public void test_display()
    {
       // p=new Person_details();
        Encap en =new Person_details();
        Assert.assertEquals("I am Overriding the method",en.display());

        //Assert.assertEquals(nam,p.display());
    }
}
