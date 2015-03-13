package za.ac.cput.week5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2015/03/13.
 */
public class NewStation implements News {

    Set<NewsObserver> newsObservers;
    int currency;

    public NewStation(int currency)
    {
        newsObservers= new HashSet<NewsObserver>();
        this.currency=currency;
    }
    @Override
    public String headLines(NewsObserver newsObserver) {
        return String.valueOf(newsObservers.add(newsObserver));
    }

    @Override
    public String sportNews(NewsObserver newsObserver) {
        return String.valueOf(newsObservers.remove(newsObserver));
    }

    @Override
    public void currency() {
        Iterator<NewsObserver> itera=newsObservers.iterator();
        while(itera.hasNext())
        {
            NewsObserver newsObserver=itera.next();
            newsObserver.newsUpdates(currency);
        }

    }

    public void setLatest_news(int latest_curr)
    {
        System.out.println("Latest currencies are"+ currency);
        currency=latest_curr;
        currency();
    }

    public int getCurrency()
    {
        return currency;
    }
}
