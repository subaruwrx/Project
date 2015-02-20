package za.ac.cput.sb;

/**
 * Created by student on 2015/02/18.
 */
import java.util.*;
public class MyMap {

    private Map m;


    public String  myMap()
    {
        m= new HashMap();

        m.put("car1","subaru");
        m.put("car2","honda");
        m.put("car3","amg c63");

        String type=(String) m.get("car2");

        return type;
    }

}
