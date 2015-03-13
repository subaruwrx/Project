package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Baby implements  Human {

    @Override
    public String walk(String walk) {
        if(walk =="cant walk" && walk =="walking on knees")
        {
            return "Small baby";
        }else{
            return "No longer a baby";
        }
    }
}
