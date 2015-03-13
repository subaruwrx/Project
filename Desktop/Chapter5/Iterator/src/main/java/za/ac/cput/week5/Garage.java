package za.ac.cput.week5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/11.
 */
public class Garage {
    List<Dealer> cars;

    public Garage()
    {
        cars= new ArrayList<Dealer>();
    }

    public void addStock(Dealer dealer)
    {
        cars.add(dealer);
    }

    public Iterator<Dealer> iterator()
    {
        return new GarageIterator();
    }

    class GarageIterator implements Iterator<Dealer>
    {
        int currIndex=0;

        @Override
        public boolean hasNext()
        {
            if(currIndex >= cars.size())
            {
                return false;
            }else {
                return true;
            }
        }


        @Override
        public Dealer next()
        {
            return cars.get(currIndex++);
        }

        @Override

        public void remove()
        {
            cars.remove(--currIndex);
        }

    }

}
