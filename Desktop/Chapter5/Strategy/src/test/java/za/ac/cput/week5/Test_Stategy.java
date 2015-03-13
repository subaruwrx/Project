package za.ac.cput.week5;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class Test_Stategy {
    String Adult="Walking perfect";
    Human adult;
    Human baby;
    HumanNature humanNature= new HumanNature(Adult,adult);

    @Before
    public void setUp() throws Exception {

        adult= new Adult();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testStrategy() throws Exception {

     baby=new Baby();
        humanNature.setHuman(baby);

        Assert.assertEquals("No longer a baby",humanNature.getbehavior());




    }
}
