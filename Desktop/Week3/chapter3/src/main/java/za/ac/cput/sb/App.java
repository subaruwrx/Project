package za.ac.cput.sb;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
   private  List mylist;

    public Object list() {

        mylist = new ArrayList();
        mylist.add("pig");
        mylist.add("dog");
        mylist.add("vernon");
        mylist.add(1);

        //mylist.remove(2);

        return mylist.get(3);
    }
}
