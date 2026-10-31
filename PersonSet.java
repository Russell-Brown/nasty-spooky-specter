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
        String result = "";
        for (Person p : people)
            result += p.toString() + "\n";
        return result;
    }

    public int duplicateGet()
    {
        return duplicateCount;
    }
}