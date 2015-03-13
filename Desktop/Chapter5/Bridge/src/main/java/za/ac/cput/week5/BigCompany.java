package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class BigCompany extends Business {

    public BigCompany(Profit profit)
    {
        this.netWeath=1500000;
        this.profit=profit;
    }

    @Override
    public void makeMoney()

    {
        double netWeath=profit.start();
        profitReport(netWeath);
    }
}
