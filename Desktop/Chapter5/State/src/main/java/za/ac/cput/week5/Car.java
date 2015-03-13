package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Car implements  CarMovement {

    CarMovement carMovement;

    public Car(CarMovement carMovement)
    {
        this.carMovement=carMovement;
    }
    public void setCarMovement(CarMovement carMovement)
    {
        this.carMovement=carMovement;
    }
    @Override
    public String moveForward() {
        return carMovement.moveForward();
    }

    @Override
    public String reverse() {
        return carMovement.reverse();
    }
}
