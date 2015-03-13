package za.ac.cput.week5;

/**
 * Created by student on 2015/03/10.
 */
public class Subaru implements Cars {
    String engine_Type;

    public Subaru(String engine_Type)
    {
        this.engine_Type=engine_Type;
    }
    @Override
    public Cars changeMotor()
    {
        return new Subaru(engine_Type);
    }

    public String toString()
    {
        return("The subaru has a:"+ engine_Type+ "Motor");
    }
}
