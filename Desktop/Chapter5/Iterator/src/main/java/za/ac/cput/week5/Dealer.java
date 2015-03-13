package za.ac.cput.week5;

/**
 * Created by student on 2015/03/11.
 */
public class Dealer {

    String car_brand;
    String car_make;
    double cost;

    public Dealer(String car_brand,String car_make,double cost)
    {
        this.car_brand=car_brand;
        this.car_make=car_make;
        this.cost=cost;
    }

    public String toString()
    {
        return(car_brand+" "+car_make+ ":R" + cost);
    }
}
