package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class SibabalweHandler extends NameHandler {

    public void  handleRequest(NameEnum request)
    {
        if(request==NameEnum.SIBABALWE)
        {
            System.out.println("SibabalweHandler handles "+request);
            System.out.println("Sibabalwe is workinng. \n ");

        }else{
            System.out.println("SibabalweHandler doesn'nt handles "+request);
            if(handler != null)
            {
                handler.handleRequest(request);
            }
        }
    }
}
