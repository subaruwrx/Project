package Dike_Booking.domain.FactoryTest;

import Dike_Booking.config_factory.BusFactory;
import Dike_Booking.domain.Bus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class Bus_fac_test {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateEvent() throws Exception {

        Map<String,String> values = new HashMap<String,String>();

        values.put("bus_name","InterCape");
        values.put("from_location", "Cape Town");
        values.put("to_location","PE");
        values.put("departure_time","14:30");
        values.put("arrival_time","12:00");





        Bus bus= BusFactory
                .createBus(values);

        Assert.assertEquals("InterCape", bus.getbus_name());
    }

    @Test
    public void testUpadteEvent() throws Exception {

        Map<String,String> values = new HashMap<String,String>();

        values.put("bus_name","InterCape");
        values.put("from_location", "Cape Town");
        values.put("to_location","PE");
        values.put("departure_time","14:30");
        values.put("arrival_time","12:00");



        Bus bus= BusFactory
                .createBus(values);
        Bus bus1= new Bus
                .Builder(bus.getbus_name())
                .copy(bus)
                .build();
        //Assert.assertEquals("sport",event1.getEvent_type());
        //Assert.assertEquals("Rugby",event1.getEvent_name());






    }
}
