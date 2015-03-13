package za.ac.cput.week5.Mediator;

/**
 * Created by student on 2015/03/13.
 */
public abstract class Employee {
    private Mediator mediator;
    private int empId;

    public Employee(Mediator mediator)
    {
        this.mediator=mediator;

        mediator.addEmployee(this);
    }

    public void shareOffer(String icon ,int shares)
    {
        mediator.shareOffer(icon,shares,this.empId);
    }

    public void buyShares(String icon, int shares)
    {
        mediator.buyShares(icon,shares,this.empId);
    }
    public void setEmpId(int empId)
    {
        this.empId=empId;
    }
}
