package za.ac.cput.SB;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.SB.config.AppConfig;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by student on 2015/02/19.
 */
public class TestConverter {
    private Convert con;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        con = (Convert) ctx.getBean("con");

    }

    @After
    public void tearDown() throws Exception {


    }


    @Test
    public void testKm_To_Miles() throws Exception
    {

        assertEquals(3.106855, con.km_To_Mile(5.00, 0.621371));
        System.out.println("5 km = " + con.km_To_Mile(5.00, 0.621371) + " Miles ");

    }

    @Test
    public void testKg_to_Pounds() throws Exception
    {

        assertEquals(22.0462, con.kg_To_Pounds(10.00, 2.20462));
        System.out.println("10 kg's = " + con.kg_To_Pounds(10.00, 2.20462) + " Pounds ");
    }
}