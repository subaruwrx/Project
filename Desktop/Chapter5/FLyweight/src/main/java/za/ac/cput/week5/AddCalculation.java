package za.ac.cput.week5;

/**
 * Created by student on 2015/03/10.
 */
public class AddCalculation implements Scientific_Cal {


    String op;

    public AddCalculation()
    {
        op="Add";
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }


    }
    @Override
    public void calculate(int num1, int num2) {

        System.out.println(op + " " +num1+ "and" + num2 + ": "+(num1 + num2));
    }

}
