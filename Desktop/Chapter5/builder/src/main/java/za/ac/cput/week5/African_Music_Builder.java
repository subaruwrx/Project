package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class African_Music_Builder implements MusicBuilder {
    private Music music;

    public African_Music_Builder()
    {
        music=new Music();
    }
    @Override
    public void buildHouse_Track()
    {
        music.setHouse_music("Deep house");
    }
    @Override
    public void biuldClassic_Track()
    {
         music.setClassic("soft classic");
    }

    @Override
    public Music getMusic()
    {
        return music;
    }


}
