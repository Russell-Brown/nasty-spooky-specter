public class PersonSetImperial extends PersonSet
{
    //TODO
    //+ add(p : Person) : void
    //- convertHeight(height : double) : double
    //- convertWeight(weight : double) : double
    //Outputs to hr_imperial_set_output.txt

    /*Notes:
    - If you add the same Person to PersonOrderedSet and PersonImperialSet
        you will see that the units get changed from metric to imperial in both.
    - Instantiate two new Person objects and pass the same name,
        height, weight info to each, and then pass one to the imperial set
        and the other to the ordered set.
    - OR overload the Person constructor so
        that you can pass a Person type variable to the constructor and
        the constructor will take care of copying the data.
    - Both solutions require two separate instantiations of Person in main.
    - Must use super.add(p) as the final step in PersonImperialSet.add
        after the conversion has been completed.
     */
}//class PersonSetImperial
