package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class Music {
    private String house_music;
    private String classic;

    public Music()
    {

    }

    public String getHouse_music()
    {
        return house_music;
    }

    public String getClassic()
    {
        return classic;
    }

    public void setHouse_music(String house_music)
    {
        this.house_music=house_music;
    }

    public void setClassic(String classic)
    {
        this.classic=classic;
    }

    public String toString()
    {
        return ("Dance music: "+house_music +"---"+"Music to relax  :"+classic);
    }

}
