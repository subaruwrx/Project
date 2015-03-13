package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class Factory {
    public static DepartFactory getFact(String option)
    {
        if(option.equalsIgnoreCase("Name"))
        {
            return new Depart_name_Fact();
        }else if(option.equalsIgnoreCase("ID"))
        {
            return new Depart_id_Fact();
        }

        return null;
    }
}
