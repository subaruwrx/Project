package Dike_Booking.domain;

/**
 * Created by student on 2015/04/18.
 */
public class Music {
    private String music_type;
    private String date;
    private String artist;
    private String place;
    private int price;

    private Music()
    {

    }

    public String getMusic_type()
    {
        return music_type;
    }

    public String getDate()
    {
        return date;
    }

    public String getArtist()
    {
        return artist;
    }
    public String getPlace()
    {
        return place;
    }

    public int getPrice()
    {
        return price;
    }

    public Music (Builder builder){

        music_type=builder.music_type;
        date=builder.date;
        artist=builder.artist;
        place=builder.place;
        price=builder.price;

    }
    public static class Builder{
        private String music_type;
        private String date;
        private String artist;
        private String place;
        private int price;

        public Builder(String music_type)
        {
            this.music_type=music_type;

        }

        public Builder date(String value)
        {
            this.date=value;
            return this;
        }

        public Builder artist(String value)
        {
            this.artist=value;
            return this;

        }

        public Builder place(String value)
        {
            this.place=value;
            return this;
        }
        public Builder price(int value)
        {
            this.price=value;
            return this;
        }
        public Builder copy(Music values)
        {
            this.music_type=values.getMusic_type();
            this.date=values.getDate();
            this.artist=values.getArtist();
            this.place=values.getPlace();
            this.price=values.getPrice();
            return this;
        }

        public Music build()
        {
            return new Music(this);
        }

    }
    @Override
    public String toString()
    {
        return String.format("music type :" + music_type +"artist: "+ artist);
    }


}
