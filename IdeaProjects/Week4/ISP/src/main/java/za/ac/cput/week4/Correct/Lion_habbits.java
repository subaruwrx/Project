package za.ac.cput.week4.Correct;

/**
 * Created by student on 2015/02/25.
 */
public class Lion_habbits implements Hunt,Fight,Eat {

    @Override
    public String hunting()
    {
        return "Stocking Buffalo";
    }

    @Override
    public String eating() {
        return "Eating a Buffalo";
    }

    @Override
    public String fighting() {
        return "Protecting the pride";
    }
}
