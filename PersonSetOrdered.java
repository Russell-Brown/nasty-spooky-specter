public class PersonSetOrdered extends PersonSet
{
//TODO
    //-Override add method to add alphabetically by name
        // + add(p : Person) : void
    //Outputs to hr_ordered_set_output.txt
    // - sort() : void

    /* Notes:
    - encouraged to use super.add(p) in PersonOrderedSet.add
        and then perform a sort of the data to make sure everything is in order.
    - Allowed to use the built-in Collections.sort method,
        but in order to make it work, Person will need to implement the
        Comparable interface and implement a compareTo method
    - May also look up and modify a bubble-sort
        or other sorting technique for solving this problem.
     */

    @Override
    public void personAdd(Person p)
    {
        //figure out which location would be sorted then add there
    }

    private static void sort()
    {

    }
}//class PersonSetOrdered
