public class Person
{
    //TODO
        //+ compareTo(p : Person) : int
        // implements Comparable?
    private String name = "";
    private double height;
    private double weight;

    //Person constructor
    public Person (String name, double height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    } //Person()

    //Formatting doesn't really work w/ names longer than 7 char.
    //I'd solve this by finding the longest name and using that .length for the formatting somehow
    //Returns a formatted string w/ name, height, weight. One line only.
    @Override
    public String toString()
    {
        return String.format("%-8s%-16.6s%-8.6s\n", this.name, this.height, this.weight);
    }// toString()

    //Returns height
    public double getHeight()
    {
        return this.height;
    }//getHeight()

    //Returns weight
    public double getWeight()
    {
        return this.weight;
    }//getWeight()

    public String getName()
    {
        return this.name;
    }

    //Sets height
    public void setHeight(double height)
    {
        this.height = height;
    }//setHeight()

    //Sets weight
    public void setWeight(double weight)
    {
        this.weight = weight;
    }//setWeight()

    //Few checks for avoiding duplicates. Each check annotated.
    @Override
    public boolean equals(Object o) {

        //if Object o is null then return false
        if (o == null) {
            return false;
        }

        //if Object o == this then return true
        if (o == this) {
            return true;
        }

        //if Object o is not an instance of Person then return false
        if (!(o instanceof Person)) {
            return false;
        }

        //Declare a new variable of type Person (perhaps named p)
        // and assign it to Object o cast as type Person
        Person p = (Person) o;

        //if Person p has the same name, height, and weight as
        // this then return true
        //else return false
        if (this.name.equals(p.name) && this.height == p.height && this.weight == p.weight) {
            return true;
        } else {
            return false;
        }
    }//equals()
} //Class Person
