package za.ac.cput.week5;

/**
 * Created by student on 2015/03/12.
 */
public class Press {
    Command command;

    public Press(Command command)
    {
        this.command=command;
    }

    public void setCommand(Command command)
    {
        this.command=command;
    }

    public void invoke()
    {
        command.execute();
    }
}
