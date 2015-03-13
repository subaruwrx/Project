package za.ac.cput.week5;

import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class Total_sum implements HumanVisitor {
    int total=0;
    @Override
    public void visit(CatElement catElement) {
        int sum =  catElement.baby + catElement.baby1;
        System.out.println("Adding " + catElement.baby1 + "+" + catElement.baby2 + "=" + sum + " to total");
        total += sum;
    }

    @Override
    public void visit(AdultElement adultElement) {
        int sum = adultElement.adult+ adultElement.adult1;
        System.out.println("Adding " + adultElement.adult+ "+" + adultElement.adult1 + "+" +  "=" + sum + "  total");
        total += sum;
    }

    @Override
    public void visit(List<AnimalElement> elementList) {
        for (AnimalElement ne : elementList) {
            ne.accept(this);
        }
    }

    public int getTotalSum() {
        return totalSum;
    }
}
