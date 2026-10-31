import java.util.ArrayList;

public class PersonSet implements PersonList
{
    protected ArrayList<Person> people = new ArrayList<Person>();
    int duplicateCount = 0;
    //Takes a person as input and returns void
    public void personAdd(Person person)
    {
        if (!(people.contains(person)))
        {
            people.add(person);
        }
        else {
            duplicateCount++;
        }
    }//personAdd()
    public Person personGet(int index)
    {
        return people.get(index);
        //takes an int as input and returns a person at the corresponding index of the input int;
    }//personGet()

    public String toString()
    {
        //TODO(1)
        //Maybe add a Header Print here w/ Name: Height(cm/in): Weight(kg/lbs):
        String result = String.format("%-8s%-16s%-8s\n","Name:", "Height(cm):", "Weight(kg):");
        for (Person p : people)
            result += p.toString();
        return result;
    }

    public int duplicateGet()
    {
        return duplicateCount;
    }
}