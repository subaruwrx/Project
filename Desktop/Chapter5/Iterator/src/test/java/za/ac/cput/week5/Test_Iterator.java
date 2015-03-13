package za.ac.cput.week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by student on 2015/03/11.
 */
public class Test_Iterator {
    Dealer dealer1= new Dealer("Bmw","3 series",40000.00);
    Dealer dealer2= new Dealer("Benz","C63 AMG",60000.00);
    Dealer dealer3= new Dealer("Subaru","WRX STI",50000.00);
    Garage garage;
    @Before
    public void setUp() throws Exception {

        garage=new Garage();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testFacade() throws Exception {

        garage.addStock(dealer1);
        garage.addStock(dealer2);
        garage.addStock(dealer3);

        //Assert.assertEquals("Bmw 3 series:R40000.0",dealer1.toString());
        //Assert.assertEquals("Benz C63 AMG:R60000.0",dealer2.toString());

        Iterator<Dealer> iterator=garage.iterator();
        while(iterator.hasNext())
        {
            Dealer dealer=iterator.next();
           Assert.assertEquals("Bmw 3 series:R40000.0",dealer1.toString());
           // System.out.println(dealer);
        }




    }
}
