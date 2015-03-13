package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class Europe_Music_Builder implements MusicBuilder {

    private Music music;

    public Europe_Music_Builder()
    {
        music=new Music();
    }
    @Override
    public void buildHouse_Track()
    {
        music.setHouse_music("Eletro house in Europe");
    }
    @Override
    public void biuldClassic_Track()
    {
        music.setClassic("Deep classic rock in Europe");
    }

    @Override
    public Music getMusic()
    {
        return music;
    }

}
