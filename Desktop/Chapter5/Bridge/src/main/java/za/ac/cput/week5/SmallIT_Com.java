package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class SmallIT_Com implements IT_Department
{

    double profit;

    public SmallIT_Com()
    {
        profit=150000;
    }
    @Override
    public double start()
    {
        return profit;
    }
}