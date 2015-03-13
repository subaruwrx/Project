package za.ac.cput.week5.Mediator;

/**
 * Created by student on 2015/03/13.
 */
public class CompanyOffer {
    private int sharePrice=0;
    private String shareIcon="";
    private int empId=0;


    public CompanyOffer(int sharePrice,String shareIcon,int empId)
    {
        this.sharePrice=sharePrice;
        this.shareIcon=shareIcon;
        this.empId=empId;
    }

    public int getSharePrice()
    {
        return sharePrice;
    }

    public String getShareIcon()
    {
        return shareIcon;
    }

    public int getEmpId()
    {
        return empId;
    }
}
