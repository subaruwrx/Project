package za.ac.cput.week4.Correct;

/**
 * Created by student on 2015/02/25.
 */
public class Business_class_Flight extends Airline {
    private int total_price;
    private  int  price_to_cape_town_frm_Pe=400;
    int num_people = 1;
    @Override
    public  int  flight()
    {


            total_price = price_to_cape_town_frm_Pe * 1;
            System.out.println("total price to cape town for one person in business class is:" + total_price);

             return total_price;
    }
}
