package Dike_Booking.config_factory;

import Dike_Booking.domain.Sport;

import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class SportFactory {
    public static Sport createSport(int price,Map<String, String> values)
    {
        Sport sport=new Sport
                .Builder(values.get("sport_type"))
                .date(values.get("date"))
                .place(values.get("place"))
                .team(values.get("team"))
                .price(price)
                .build();
        return sport;
    }
}
