package za.ac.cput.week5;

/**
 * Created by student on 2015/03/13.
 */
public class Test_Chain {

   HumanHandler name=setUpChain();

    name.handleRequest(NameEnum.VERNON);
    name.handleRequest(NameEnum.DIKE);
    name.handleRequest(NameEnum.ROSS);

    public static HumanHandler setUpChain()
    {
        HumanHandler  vern=new HumanHandler();

    }
}
