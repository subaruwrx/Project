package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class SIngleTon {


    private static SIngleTon instance=null;

    private SIngleTon()
    {

    }
    public static SIngleTon getInstance()
    {
        if(instance == null) {
            instance = new SIngleTon();
        }
        return instance;

    }

    public String  myName()
    {
        return "Sibabalwe";
    }

}
