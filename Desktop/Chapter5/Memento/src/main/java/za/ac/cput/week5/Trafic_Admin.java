package za.ac.cput.week5;

/**
 * Created by student on 2015/03/11.
 */
public class Trafic_Admin {
    Object objectM;

    public void saveDoc(Traffic_fine_info fine_info)
    {
        objectM=fine_info.save();
    }

    public void restoreDoc(Traffic_fine_info fine_info)
    {
        fine_info.restore(objectM);
    }
}
