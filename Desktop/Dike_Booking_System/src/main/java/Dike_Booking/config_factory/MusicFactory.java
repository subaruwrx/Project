package Dike_Booking.config_factory;

import Dike_Booking.domain.Music;

import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class MusicFactory {
    public static Music createMusic(int price,Map<String, String> values)
    {
        Music music = new Music
                .Builder(values.get("music_type"))
                .date(values.get("date"))
                .artist(values.get("artist"))
                .place(values.get("place"))
                .price(price)
                .build();
        return music;
    }
}
