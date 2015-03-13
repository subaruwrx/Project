package za.ac.cput.week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class Test_Temp {

    Garden garden1;
    Garden garden2= new Carrots();
    @Before
    public void setUp() throws Exception {
        garden1=new Potatoes();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testObserver() throws Exception {
        garden1.makeGarden();
        System.out.println();
        garden2.makeGarden();

    }

}
