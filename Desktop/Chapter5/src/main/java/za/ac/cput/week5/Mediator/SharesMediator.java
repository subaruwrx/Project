package za.ac.cput.week5.Mediator;

import java.util.ArrayList;

/**
 * Created by student on 2015/03/13.
 */
public class SharesMediator implements Mediator {
    private ArrayList<Employee> employee;
    private ArrayList<CompanyOffer> companyOffer;
    private ArrayList<CompanyOffer> sharePriceOffers;

    private int empId=0;

    public SharesMediator()
    {
        employee=new ArrayList<Employee>();
        companyOffer=new ArrayList<CompanyOffer>();
        sharePriceOffers= new ArrayList<CompanyOffer>();
    }

    public void addEmployee(Employee employees)
    {
        employee.add(employees);
        empId ++;
        employees.setEmpId(empId);
    }

    public void shareOffer(String stock,int shares,int empId)
    {
        boolean sharesSold= false;
        for(CompanyOffer offer:companyOffer)
        {
            if(offer.getShareIcon() ==stock && offer.getSharePrice()==shares)
            {
                System.out.println("shares of " + stock + "sold to employee id" + offer.getEmpId());
                companyOffer.remove(offer);
                sharesSold=true;
            }
            if(sharesSold){
                break;
            }
        }
        if(!sharesSold)
        {
            System.out.println(shares +"share of"+ stock+"Added");
            CompanyOffer companyOffer1= new CompanyOffer(shares,stock,empId);
            sharePriceOffers.add(companyOffer1);
        }
    }
    public void buyShares(String stock,int shares, int empId)
    {
        boolean shareBought=false;
        for(CompanyOffer offer:companyOffer)
        {
            if(offer.getShareIcon() ==stock && offer.getSharePrice()==shares)
            {
                System.out.println("shares of "+ stock +"sold to employee id"+ offer.getEmpId());
                companyOffer.remove(offer);
                shareBought=true;
            }
            if(shareBought){
                break;
            }
        }
        if(!shareBought)
        {
            System.out.println(shares +"share of"+ stock+"Added");
            CompanyOffer companyOffer1= new CompanyOffer(shares,stock,empId);
            sharePriceOffers.add(companyOffer1);
        }


    }
    public void getShareOffer()
    {
        System.out.println("\nShares for sale");
        for(CompanyOffer offer:companyOffer)
            {
                System.out.println(offer.getSharePrice() +"of" + offer.getShareIcon());
            }
        System.out.println("\nShares for offer");
        for(CompanyOffer offer:companyOffer)
        {
            System.out.println(offer.getSharePrice() +"of" + offer.getShareIcon());
        }
    }

}
