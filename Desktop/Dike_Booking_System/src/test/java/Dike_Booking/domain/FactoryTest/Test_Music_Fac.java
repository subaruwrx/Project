package Dike_Booking.domain.FactoryTest;

import Dike_Booking.config_factory.MusicFactory;
import Dike_Booking.domain.Music;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class Test_Music_Fac {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateMusic() throws Exception {

        Map<String,String> values = new HashMap<String,String>();


        values.put("music_type", "house");
        values.put("date","16/march/2015");
        values.put("artist", "Black coffee");
        values.put("place", "Green point");






        Music music = MusicFactory
                .createMusic(1000, values);

        Assert.assertEquals(1000, music.getPrice());

    }

    @Test
    public void testUpdateCard() throws Exception {

        Map<String,String> values = new HashMap<String,String>();


       values.put("music_type", "house");
        values.put("date","16/march/2015");
        values.put("artist", "Black coffee");
        values.put("place", "Green point");



        Music music = MusicFactory
                .createMusic(1000, values);

        Music music1= new  Music
                .Builder(music.getMusic_type())
                .copy(music)
                .build();
        Assert.assertEquals("house",music1.getMusic_type() );
        Assert.assertEquals("16/march/2015",music1.getDate());
        Assert.assertEquals("Black coffee",music1.getArtist());
        Assert.assertEquals("Green point",music1.getPlace());
        Assert.assertEquals(1000,music1.getPrice());




    }
}
