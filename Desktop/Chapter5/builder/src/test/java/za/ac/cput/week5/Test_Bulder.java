package za.ac.cput.week5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/09.
 */
public class Test_Bulder {
    MusicBuilder musicBuilder=new African_Music_Builder();
    MusicBuilder musicBuilder1=new Europe_Music_Builder();

    MusicProducer musicProducer=new MusicProducer(musicBuilder);
    MusicProducer musicProducer1=new MusicProducer(musicBuilder1);


    @Before
    public void setUp() throws Exception {



    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testBuilder() throws Exception {
        musicProducer.createTrack();
        Music music=musicProducer.getMusic();
        Assert.assertEquals("Dance music: Deep house---Music to relax  :soft classic", music.toString());

        musicProducer1.createTrack();
        Music music1=musicProducer1.getMusic();
        Assert.assertEquals("Dance music: Eletro house in Europe---Music to relax  :Deep classic rock in Europe", music1.toString());



    }

}

