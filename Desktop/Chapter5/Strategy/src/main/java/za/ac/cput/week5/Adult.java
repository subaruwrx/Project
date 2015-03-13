package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Adult implements Human{


    @Override
    public String walk(String walk) {
        if(walk == "Walking perfect")
        {
            return "Healthy adult";
        }else {
            return "Old adult";
        }
        }
    
}
