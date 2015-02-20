package za.ac.cput.SB.kg_impl;
import za.ac.cput.SB.Kg_Pound;
/**
 * Created by student on 2015/02/19.
 */
public class kg_imp implements  Kg_Pound{
    @Override

    public double kg_To_Pounds(double a, double b)
    {
        return a*b;
    }
}
