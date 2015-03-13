package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class SmallCompany extends Business {
    public SmallCompany(Profit profit)
    {
        this.netWeath=150000;
        this.profit=profit;
    }

    @Override
    public void makeMoney()
    {
        double netWeath=profit.start();
        profitReport(netWeath);
    }
}
