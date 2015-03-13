package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Viewer1 implements NewsObserver {
    @Override
    public void newsUpdates(int currency) {
        System.out.println("TThe currency for viewer 1 is that  the rand is weak from the dollar by: R" +currency);
    }
}
