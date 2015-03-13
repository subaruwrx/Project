package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public abstract class CarDecorator implements Car{

    Car car;

    public CarDecorator(Car car)
    {
        this.car=car;
    }
}
