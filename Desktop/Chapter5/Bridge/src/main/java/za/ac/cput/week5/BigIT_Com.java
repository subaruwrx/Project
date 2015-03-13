package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class BigIT_Com implements IT_Department{

    double profit;

    public BigIT_Com()
    {
        profit=150000;
    }
    @Override
    public double start()
    {
        return profit;
    }
}
