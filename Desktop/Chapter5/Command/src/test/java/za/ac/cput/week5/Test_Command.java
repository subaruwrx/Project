package za.ac.cput.week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/12.
 */
public class Test_Command {

    Laptop laptop;
    Pc pc=new Pc();

    Command laptopCom;
    Command pcCommand;

    @Before
    public void setUp() throws Exception {

      laptop=new Laptop();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCommand() throws Exception {
        laptopCom = new LaptopCommand(laptop);
        pcCommand = new Pc_Command(pc);
        Press press= new Press(laptopCom);
        press.invoke();

        press.setCommand(pcCommand);
        press.invoke();



    }
}
