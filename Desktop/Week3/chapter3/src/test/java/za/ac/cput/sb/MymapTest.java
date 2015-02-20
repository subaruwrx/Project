package za.ac.cput.sb;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/18.
 */
public class MymapTest
{
    MyMap ma= new MyMap();
    @Test
    public void testMymap() {



        Assert.assertEquals("honda", ma.myMap());

    }
}