package za.ac.cput.SB.imple;

import za.ac.cput.SB.Convert;

/**
 * Created by student on 2015/02/19.
 */
public class ConverterImp implements Convert {
    @Override
    public double km_To_Mile(double a,double b)
    {
        return a*b;
    }
    @Override
    public double kg_To_Pounds(double a, double b)
    {
        return a*b;
    }
}
