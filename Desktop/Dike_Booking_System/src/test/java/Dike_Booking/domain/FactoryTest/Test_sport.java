package Dike_Booking.domain.FactoryTest;

import Dike_Booking.config_factory.SportFactory;
import Dike_Booking.domain.Sport;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class Test_sport {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreatedSport() throws Exception {

        Map<String,String> values = new HashMap<String,String>();


        values.put("sport_type", "Rugby");
        values.put("date","12 march 2015");
        values.put("place", "Ellis park");
        values.put("team", "Blue bulls");




        Sport sport= SportFactory
                .createSport(400, values);

        Assert.assertEquals("Blue bulls", sport.getTeam());
        Assert.assertEquals(400, sport.getPrice());
    }

    @Test
    public void testUpdateSport() throws Exception {

        Map<String,String> values = new HashMap<String,String>();



        values.put("sport_type", "Rugby");
        values.put("date","12 march 2015");
        values.put("place", "Ellis park");
        values.put("team", "Blue bulls");




        Sport sport= SportFactory
                .createSport(400, values);

        Assert.assertEquals("Blue bulls", sport.getTeam());
        Assert.assertEquals(400, sport.getPrice());

        Sport sport1= new  Sport
                .Builder(sport.getSport_type())
                .copy(sport)
                .price(500)
                .build();
        Assert.assertEquals("Blue bulls",sport1.getTeam() );
        Assert.assertEquals("12 march 2015",sport1.getDate());
        Assert.assertEquals(500, sport1.getPrice());

        Assert.assertEquals(400, sport.getPrice());















    }
}
