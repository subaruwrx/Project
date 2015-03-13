package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class AdultElement implements HumanElement {
    int adult;
    int adult1;

    public AdultElement(int adult,int adult1)
    {
        this.adult=adult;
        this.adult1=adult1;
    }

    @Override
    public void accept(HumanVisitor humanVisitor)
    {
        this. humanVisitor.humanVisitor(this);
    }




}
