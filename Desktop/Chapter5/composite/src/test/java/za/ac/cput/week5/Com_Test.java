package za.ac.cput.week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class Com_Test {
     Author authour1= new Author("siba");
    Author authour2= new Author("baba");
    Author authour3= new Author("mzo,");

    Composite composite = new Composite();


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCom() throws Exception {


        composite.add( authour1);
        composite.add( authour2);
        composite.add(authour2);

        Assert.assertEquals("I the writer is siba",authour1.author());

    }
}
