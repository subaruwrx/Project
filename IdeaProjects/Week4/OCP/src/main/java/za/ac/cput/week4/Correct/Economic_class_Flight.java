package za.ac.cput.week4.Correct;

/**
 * Created by student on 2015/02/25.
 */
public class Economic_class_Flight extends Airline {

    int total_price;
    @Override
    public int  flight()
    {
        int  price_to_cape_town_frm_Pe=300;

        int num_people = 0;
        int infant_price=100;
        int infant=1;


            total_price = price_to_cape_town_frm_Pe * 1 + infant_price;
            System.out.println("total price to cape town for one person and infant in Economic class is:" + total_price);

            return  total_price;
    }
}
