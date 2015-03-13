package za.ac.cput.week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week5.Facade.Facede;

/**
 * Created by student on 2015/03/11.
 */
public class Test_Facade {
     Facede facede= new Facede();
    String n="is";
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testFacade() throws Exception {


   Assert.assertEquals("",facede.cubeN(n));



    }
}
