package Dike_Booking.domain;

/**
 * Created by student on 2015/04/18.
 */
public class Flight_details {
    private int flight_id;
    private String flight_date;
    private int price;
    private int seats_aval;

    private Flight_details()
    {

    }

    public int getFlight_id()
    {
        return flight_id;
    }

    public String getFlight_date()
    {
        return flight_date;
    }

    public int getprice()
    {
        return price;
    }

    public int getSeats_aval()
    {
        return seats_aval;
    }
    public  Flight_details(Builder builder){
        flight_id=builder.flight_id;
        flight_date=builder.flight_date;
        price=builder.price;
        seats_aval=builder.seats_aval;

    }
    public static class Builder{
        private int flight_id;
        private String flight_date;
        private int price;
        private int seats_aval;

        public Builder(int flight_id)
        {
            this.flight_id=flight_id;

        }
        public Builder flight_date(String value)
        {
            this.flight_date=value;
            return this;
        }

        public Builder price(int value)
        {
            this.price=value;
            return this;
        }
        public Builder seat_aval(int value)
        {
            this.seats_aval=value;
            return this;
        }
        public Builder copy(Flight_details values)
        {
            this.flight_id=values.getFlight_id();
            this.flight_date=values.getFlight_date();
            this.seats_aval=values.getSeats_aval();
            this.price=values.getprice();
            return this;
        }
        public  Flight_details build()
        {
            return new Flight_details(this);
        }

    }
    @Override
    public String toString()
    {
        return String.format(" flight number :" +flight_id );
    }

}
