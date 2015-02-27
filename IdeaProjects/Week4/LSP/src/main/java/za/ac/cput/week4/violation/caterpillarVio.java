package za.ac.cput.week4.violation;

/**
 * Created by student on 2015/02/26.
 */
public class caterpillarVio extends Type_vehicle {
    public String openDoor()
    {
        return"Opening door";
    }

    public String closeDoor()
    {
        return "closing Door";
    }

    public String start()
    {
        return "starting vehicle";
    }

    public String drive()
    {
        return "driving";
    }

    public String cat_Digging()//violation
    {
        return "Catter piller digging a hole";
    }
}
