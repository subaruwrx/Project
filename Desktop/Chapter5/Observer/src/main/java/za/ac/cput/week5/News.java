package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public interface News {
    public String headLines(NewsObserver newsObserver);
    public String sportNews(NewsObserver newsObserver);
    public void currency();
}
