package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class DoorDecorator extends  CarDecorator{

    public DoorDecorator(Car car)
    {
        super(car);
    }

    @Override
    public void look()
    {
        car.look();
        System.out.println("car has doors");
        open();
    }

    public void  open()
    {
        System.out.println("doors can open");
    }
}
