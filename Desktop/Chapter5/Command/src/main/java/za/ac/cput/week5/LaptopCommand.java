package za.ac.cput.week5;

/**
 * Created by student on 2015/03/12.
 */
public class LaptopCommand implements Command {

    Laptop laptop;

    public LaptopCommand(Laptop laptop)
    {
        this.laptop=laptop;
    }
    @Override
    public void execute()
    {
        laptop.runCmd();
    }


}
