package za.ac.cput.week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week4.Correct.Lion_habbits;

/**
 * Created by student on 2015/02/25.
 */
public class Test_isp_c {

        private Lion_habbits h;
        @Before
        public void setUp() throws Exception {
            h = new Lion_habbits();


        }

        @After
        public void tearDown() throws Exception {


        }



        @Test
        public void testInvalid() throws Exception {

           Assert.assertEquals("Eating a Buffalo",h.eating());

        }


}
