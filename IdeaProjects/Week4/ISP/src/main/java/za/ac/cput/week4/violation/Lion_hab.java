package za.ac.cput.week4.violation;

/**
 * Created by student on 2015/02/25.
 */
public class Lion_hab implements Habbits {

    @Override
    public String eating() {
        return "Eating a Buffalo";
    }

    @Override
    public String fighting() {
        return "Protecting the pride";
    }

    @Override
    public String hunting() {
        return "Stocking Buffalo";
    }
}
