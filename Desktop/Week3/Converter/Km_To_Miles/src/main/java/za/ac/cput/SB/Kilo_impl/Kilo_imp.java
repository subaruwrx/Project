package za.ac.cput.SB.Kilo_impl;

import za.ac.cput.SB.Kilo_Mile;
/**
 * Created by student on 2015/02/19.
 */
public class Kilo_imp implements Kilo_Mile {

    @Override
    public double km_To_Mile(double a, double b)
    {
        return a*b;
    }
}
