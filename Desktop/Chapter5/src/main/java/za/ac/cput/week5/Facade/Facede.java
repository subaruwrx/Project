package za.ac.cput.week5.Facade;

/**
 * Created by student on 2015/03/11.
 */
public class Facede {

    public String cubeN(String n)
    {
        Name name=new Name();
        return name.combine(n);
    }


    public String cubeOtherString(String n)
    {
        Name name=new Name();
        Name1 name1=new Name1();
        return name1.combineOther(name,n);
    }


    public String cubeMore(String n)
    {
        Name name=new Name();
        Name1 name1=new Name1();
        Name2 name2=new Name2();
        return name2.combineMore(name,name1,n);
    }
}

