package za.ac.cput.week5.Mediator;

/**
 * Created by student on 2015/03/13.
 */
public interface Mediator {
    public void shareOffer(String stock,int shares,int empId);
    public void buyShares(String stock,int shares, int empId);
    public void addEmployee(Employee employee);
}
