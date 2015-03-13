package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public abstract  class NameHandler {

    NameHandler handler;

    public void setHandler()
    {
        this.handler=handler;
    }

    public abstract void handleRequest(NameEnum request);
}
