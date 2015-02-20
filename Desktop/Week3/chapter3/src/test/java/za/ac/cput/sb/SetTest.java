package za.ac.cput.sb;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class SetTest {

    MySet s =new MySet();
    @Test
    public void testSet()
    {


        Assert.assertEquals(false,s.mySet());
    }
}
