package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class Depart_name_Fact extends  DepartFactory {

    @Override
    public Depart_names getDepartName(String name)
    {
        if(name.equalsIgnoreCase("Information_Tech"))
        {
            return new Information_Tech();

        }else if(name.equalsIgnoreCase("Medicine"))
        {
            return new Medicine();
        }else
            return new Business();
    }

    @Override
    public Departments getDepart_id(String id)
    {
        return null;
    }
}
