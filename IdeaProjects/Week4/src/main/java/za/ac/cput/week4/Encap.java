package za.ac.cput.week4;

/**
 * Created by student on 2015/02/23.
 */
public class Encap {

    private int age;
    private String name="Sibabalwe";
    private String surname;

    public Encap()
    {


    }
    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;

    }

    public String getSurname()
    {
        return surname;
    }

    public void setAge(int age1)

    {
        age=age1;
    }

    public void setName(String nm )
    {
        name=nm;
    }

    public void setSurname(String surnm)

    {
        surname=surnm;
    }

    public String display()
    {
        return("this is my method");
    }

}
