package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class MusicProducer {
    private MusicBuilder musicBuilder=null;

    public  MusicProducer(MusicBuilder musicBuilder1)
    {
        this.musicBuilder=musicBuilder1;
    }

    public void createTrack()
    {
        musicBuilder.buildHouse_Track();
        musicBuilder.biuldClassic_Track();
    }

    public Music getMusic()
    {
        return musicBuilder.getMusic();
    }
}
