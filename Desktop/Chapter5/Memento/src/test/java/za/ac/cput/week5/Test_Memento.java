package za.ac.cput.week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/11.
 */
public class Test_Memento {

    Trafic_Admin trafic_admin;
    Traffic_fine_info fine;
    @Before
    public void setUp() throws Exception {

       trafic_admin=new Trafic_Admin();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testMemento() throws Exception {

       fine=new Traffic_fine_info("Bob","Dike",8,500.00);

        Assert.assertEquals("name : Bob--Surname :Dike--Code on type: 8--Amount due: R 500.0",fine.toString());
        fine.setCode_fine(8,400);
        Assert.assertEquals("name : Bob--Surname :Dike--Code on type: 8--Amount due: R 400.0",fine.toString());






    }
}
