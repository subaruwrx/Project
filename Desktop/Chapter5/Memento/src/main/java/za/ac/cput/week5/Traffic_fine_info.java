package za.ac.cput.week5;

/**
 * Created by student on 2015/03/11.
 */
public class Traffic_fine_info {
    String name;
    String surname;
    int licence_code;
    double fine;

    public Traffic_fine_info(String name, String surname,int licence_code,double fine )
    {
        this.name=name;
        this.surname=surname;
        this.licence_code=licence_code;
        this.fine=fine;
    }
    public void setCode_fine(int licence_code,double fine)
    {
        this.licence_code=licence_code;
        this.fine=fine;
    }
    public Memonto save()
    {
        return new Memonto(name,surname,licence_code,fine);

    }

    public void restore(Object objectM)
    {
        Memonto memonto=(Memonto)objectM;
        name=memonto.mName;
        surname=memonto.mSurname;
        licence_code=memonto.mLicence_code;
        fine=memonto.mFine;
    }

    private class Memonto
    {
        String mName;
        String mSurname;
        int mLicence_code;
        double mFine;

        public Memonto(String name, String surname,int licence_code,double fine)
        {
            mName=name;
            mSurname=surname;
            mLicence_code=licence_code;
            mFine=fine;
        }
    }
    public String toString()
    {
        return("name : "+ name + "--" + "Surname :" +surname+"--" +"Code on type: "+ licence_code+"--"+ "Amount due: R " +fine);
    }
}
