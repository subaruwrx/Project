package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class WheelsDecorator extends CarDecorator{
    public WheelsDecorator(Car car)
    {
        super(car);
    }

    @Override
    public void look()
    {
        car.look();
        System.out.println("spinning");
        spin();
    }

    public void  spin()
    {
        System.out.println("smoke coming from wheels");
    }
}
