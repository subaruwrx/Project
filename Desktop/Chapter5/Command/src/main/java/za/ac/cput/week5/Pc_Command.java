package za.ac.cput.week5;

/**
 * Created by student on 2015/03/12.
 */
public class Pc_Command implements  Command {
    Pc pc;
    public  Pc_Command(Pc pc)
    {
        this.pc=pc;
    }

    @Override
    public void execute() {
        pc.hack();
    }
}
