package za.ac.cput.week5;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class Test_Observer {
    NewStation newStation;
    @Before
    public void setUp() throws Exception {
        newStation =new NewStation(5);

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testObserver() throws Exception {

     Viewer1 viewer1 = new Viewer1();
     Viewer2 viewer2 = new Viewer2();
     newStation.headLines(viewer1);
     newStation.headLines(viewer2);


        newStation.setLatest_news(6);
        Assert.assertEquals(6,newStation.getCurrency());

        newStation.headLines(viewer1);
        Assert.assertEquals(6,newStation.getCurrency());

        newStation.setLatest_news(7);
        Assert.assertEquals(7,newStation.getCurrency());


    }
}
