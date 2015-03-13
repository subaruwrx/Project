package za.ac.cput.week5;

/**
 * Created by student on 2015/03/09.
 */
public class Depart_id_Fact extends DepartFactory  {

    @Override
    public Departments getDepart_id(String id)
    {
        if(id.equalsIgnoreCase("I_T"))
        {
            return new I_T();
        }else if(id.equalsIgnoreCase("Med"))
        {
            return new Med();
        }else
        {
            return new Bus();
        }

    }

    @Override

    public Depart_names getDepartName(String name)
    {
        return null;
    }


}
