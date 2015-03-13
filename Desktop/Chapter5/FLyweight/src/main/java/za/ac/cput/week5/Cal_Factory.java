package za.ac.cput.week5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/10.
 */
public class Cal_Factory {

    private static Cal_Factory calFactory;

    private Map<String,Scientific_Cal>scientific_calMap;
    private Cal_Factory()
    {
        scientific_calMap=new HashMap<String,Scientific_Cal>();
    }

    public static Cal_Factory getInstance()
    {
        if(calFactory == null)
        {
            calFactory= new Cal_Factory();
        }
        return calFactory;
    }

    public Scientific_Cal getScientific_Cal(String key)
    {
        if(scientific_calMap.containsKey(key))
        {
            return scientific_calMap.get(key);
        }else{
            Scientific_Cal scientific_cal;
            if("add".equals(key))
            {
                scientific_cal=new AddCalculation();
            }else {
                scientific_cal= new MultiCalculation();
            }
            scientific_calMap.put(key,  scientific_cal);
            return scientific_cal;
        }
    }
}
