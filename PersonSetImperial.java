import java.util.ArrayList;

public class PersonSetImperial extends PersonSet
{

    @Override
    public void personAdd(Person p)
    {
        p.setHeight(convertHeight(p.getHeight()));
        p.setWeight(convertWeight(p.getWeight()));
        super.personAdd(p);
    }

    //cm/2.54 = inches
    private static double convertHeight(double height)
    {
        return height/2.54;
    }

    //1kg = 2.205lbs
    private static double convertWeight(double weight)
    {
        return weight * 2.205;
    }
}//class PersonSetImperial
