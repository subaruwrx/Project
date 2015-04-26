package Dike_Booking.config_factory;

import Dike_Booking.domain.Event;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */

public class EventFactory {

    public static Event createEvents(Map<String,String>values)
    {
        Event event= new Event
                .Builder(values.get("event_type"))
                .name(values.get("event_name"))
                .build();
        return event;
    }
}
