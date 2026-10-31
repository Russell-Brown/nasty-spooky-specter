public class Person
{

    private String name = "";
    private double height;
    private double weight;

    public Person (String name, double height, double weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    } //Person()

    //Formatting doesn't really work w/ names longer than 7 char.
    //I'd solve this by finding the longest name and using that .length for the formatting somehow
    @Override
    public String toString()
    {
        return String.format("%-8s%-16s%-8s\n", this.name, this.height, this.weight);
    }// toString()

    public double getHeight()
    {
        return this.height;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    //Equals method outline
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
    }
} //Class Person
