package za.ac.cput.week5;

import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public interface  HumanVisitor {
    public void visit(AdultElement adultElement);
    public void visit(BabyElement babyElement);
    public void visit(List<HumanElement> elementList );
}
