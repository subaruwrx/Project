package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class HumanHandler extends NameHandler {

   public  void handleRequest(NameEnum request)
   {
       if(request == NameEnum.DIKE)
       {
           System.out.println("HumanHandler handler" + request);
           System.out.println();
       }else {
           System.out.println("HumanHandler doesnt handle"+ request);
           if(handler !=null)
           {
               handler.handleRequest(request);
           }
       }
   }
}
