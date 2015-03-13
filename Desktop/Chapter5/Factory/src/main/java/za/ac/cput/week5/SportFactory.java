package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class SportFactory {

    public Sport getType_Sport(String type_of_sport)
    {
        if(type_of_sport.equalsIgnoreCase("Rugby"))
        {
            return new Rugby();
        }else{
            return new Football();
        }
    }
}
