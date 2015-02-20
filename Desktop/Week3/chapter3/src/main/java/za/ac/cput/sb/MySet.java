package za.ac.cput.sb;

/**
 * Created by student on 2015/02/18.
 */
import java.util.*;

public class MySet
{
  private Set set;
    public Object mySet()
    {
        set= new HashSet();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(6);

        return set.contains(8);
    }

}
