package Dike_Booking.domain;

/**
 * Created by student on 2015/04/18.
 */
public class Bus {
    private String bus_name;
    private String from_location;
    private String to_location;
    private String departure_time;
    private String arrival_time;

    private Bus()
    {

    }

    public String getbus_name()
    {
        return bus_name;
    }

    public String getFrom_location()
    {
        return from_location;
    }

    public String getTo_location()
    {
        return to_location;
    }
    public String getDeparture_time()
    {
        return departure_time;
    }

    public String getArrival_time()
    {
        return arrival_time;
    }

    public Bus (Builder builder)
    {
        bus_name=builder.bus_name;
        from_location=builder.from_location;
        to_location=builder.to_location;
        departure_time=builder.departure_time;
        arrival_time=builder.arrival_time;
    }
    public static class Builder{
        private String bus_name;
        private String from_location;
        private String to_location;
        private String departure_time;
        private String arrival_time;

        public Builder(String bus_name)
        {
            this.bus_name=bus_name;

        }

        public Builder from(String value)
        {
            this.from_location=value;
            return this;
        }

        public Builder to(String value)
        {
            this.to_location=value;
            return this;

        }
        public Builder dep_time(String value)
        {
            this.departure_time=value;
            return this;
        }

        public Builder arr_time(String value)
        {
            this.arrival_time=value;
            return this;
        }
        public Builder copy(Bus value)
        {
            this.bus_name=value.getbus_name();
            this.arrival_time=value.getArrival_time();
            this.departure_time=value.getDeparture_time();
            this.from_location=value.getFrom_location();
            this.to_location=value.getTo_location();
            return this;
        }
        public  Bus build()
        {
            return new Bus(this);
        }


    }

    @Override
    public String toString()
    {
        return String.format(" Bus name :" +bus_name );
    }
}
