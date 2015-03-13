package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class BabyElement implements HumanElement {
    int baby;
    int baby1;

    public BabyElement(int adult,int adult1)
    {
        this.baby=baby;
        this.baby1=baby1;
    }

    @Override
    public void accept(HumanVisitor humanVisitor)
    {
        this. humanVisitor.humanVisitor(this);
    }

}
