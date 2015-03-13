package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Drive_slow implements CarMovement {

    @Override
    public String moveForward() {
        return "driving slow";
    }

    @Override
    public String reverse() {
        return "reversing slow";
    }
}
