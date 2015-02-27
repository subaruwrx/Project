package za.ac.cput.week4;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.week4.correction.Manager;
import za.ac.cput.week4.correction.Supervisor;
import za.ac.cput.week4.correction.Worker;

/**
 * Created by student on 2015/02/27.
 */
public class Test_adp {

    Manager m= new Manager();
    Supervisor s=new Supervisor();
    Worker w=new Worker();

    @Test
    public void testValid() throws Exception {
        Assert.assertEquals("check on the workers Supervisor", m.check());
        Assert.assertEquals("I have a job for you worker", s.instuct());
        Assert.assertEquals("doing Job", w.doing());

    }
}
