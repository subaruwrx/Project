package za.ac.cput.week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class Test_abstract {
    DepartFactory fac;
    @Before
    public void setUp() throws Exception {

        fac=Factory.getFact("Name");
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAbstract() throws Exception {

    }
}
