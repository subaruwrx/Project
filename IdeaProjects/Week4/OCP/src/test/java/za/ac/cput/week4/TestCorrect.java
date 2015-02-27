package za.ac.cput.week4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week4.Correct.Business_class_Flight;
import za.ac.cput.week4.Correct.Economic_class_Flight;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/25.
 */
public class TestCorrect {

    private Business_class_Flight fl;
    private Economic_class_Flight ec =new Economic_class_Flight();
    @Before
    public void setUp() throws Exception {
        fl = new Business_class_Flight();

    }

    @After
    public void tearDown() throws Exception {


    }



    @Test
    public void testValid() throws Exception {
        assertEquals(400,fl.flight());
        assertEquals(400,ec.flight());

    }


}
