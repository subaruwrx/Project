package za.ac.cput.SB;

/**
 * Created by student on 2015/02/19.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.SB.kg_impl.kg_imp;

import static junit.framework.TestCase.assertEquals;

public class TestWeight {

    private Kg_Pound kg;
    @Before
    public void setUp() throws Exception {
        kg= new kg_imp();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testKg_to_Pounds() throws Exception {

        assertEquals(22.0462, kg.kg_To_Pounds(10.00,2.20462));
        System.out.println("10 kg's = "+kg.kg_To_Pounds(10.00,2.20462) +" Pounds ");


    }
}
