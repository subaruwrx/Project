package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public abstract  class Business {
    Profit profit;
    double netWeath;

    public void setProfit(Profit profit)
    {
        this.profit=profit;
    }

    public void profitReport(double netWeath)
    {
        if(netWeath <= 150000 )
        {
            System.out.println("the business has mate its target");
        }else{
            System.out.println("business is dying");
        }
    }
}
