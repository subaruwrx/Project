package za.ac.cput.week5;

import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class SumVisitor implements HumanVisitor {

    @Override
    public void visit(AdultElement adultElement) {
        int sum =adultElement.adult +adultElement.adult1;
        System.out.println(adultElement.adult + "+" + adultElement.adult1 + ":" + sum);
    }

    @Override
    public void visit(BabyElement babyElement) {

            int sum = babyElement.baby + babyElement.baby1;
            System.out.println(babyElement.baby + "+" + babyElement.baby1 + "+" + "=" + sum);

    }

    @Override
    public void visit(List<HumanElement> elementList) {

    }
}
