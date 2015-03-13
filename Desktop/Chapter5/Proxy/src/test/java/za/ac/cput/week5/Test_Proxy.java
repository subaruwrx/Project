package za.ac.cput.week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/10.
 */
public class Test_Proxy {

    Proxy proxy;
    BigAnimals big =new BigAnimals();
    @Before
    public void setUp() throws Exception {
        proxy= new Proxy();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testProxy() throws Exception {

        proxy.opening();
        big.opening();



    }
}
