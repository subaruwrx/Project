package za.ac.cput.week5.Facade;

/**
 * Created by student on 2015/03/11.
 */
public class Name2 {
    public String combineMore(Name nam,Name1 nam1,String n)
    {
        return nam.combine(n) +nam1 .combineOther(nam,n);

    }
}
