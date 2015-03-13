package za.ac.cput.week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class Test_Fly_weight {
    Cal_Factory cal_factory= Cal_Factory.getInstance();


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testFlyweight() throws Exception {

        for(int j=0;j <5; j++)
        {
            Scientific_Cal adder= cal_factory.getScientific_Cal("add");
            adder.calculate(j,j);
            Scientific_Cal multi=cal_factory.getScientific_Cal("multi");
            multi.calculate(j,j);
        }




    }
}
