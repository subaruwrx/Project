package za.ac.cput.week5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.week5.Mediator.SharesMediator;
import za.ac.cput.week5.Mediator.Sibabalwe;
import za.ac.cput.week5.Mediator.Vernon;

/**
 * Created by student on 2015/03/13.
 */
public class Test_Mediator {
    SharesMediator med=new SharesMediator();
    Sibabalwe ceo= new Sibabalwe(med);
    Vernon cfo= new Vernon(med);
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testFacade() throws Exception {

      ceo.shareOffer("CEO07",900);
      ceo.shareOffer("cfo",700);

      cfo.buyShares("CEO07",700);
      cfo.shareOffer("mec",600);

      ceo.shareOffer("ngo",60);
      med.getShareOffer();

    }
}
