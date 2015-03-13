package za.ac.cput.week5;

/**
 * Created by student on 2015/03/10.
 */
public class MotorBike implements Cars{
    String kw;

    public MotorBike(String kw)
    {
        this.kw=kw;
    }
    @Override
    public Cars changeMotor()
    {
        return new MotorBike(kw);
    }

    public String toString()
    {
        return("The subaru has a:"+ kw+ "Motor");
    }
}
