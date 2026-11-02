/*
Name: Russell Brown
Purpose: Work with / learn about inheritance, polymorphism, interfaces, and file I/O.
Date: 10/30/26

This code is provided to give you a
starting place. It should be modified.
No further imports are needed.
To earn full credit, you must also
answer the following questions:

Q1: Car and Engine are related
by which, Inheritance or Composition?
-Inheritance

Q2: Color and Red are related
by which, Inheritance or Composition?
-Composition

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
-Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
-Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
-Composition

*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//TODO
		//adding methods to the classes to get the data in a text format for writing to file. Think I already did this?
		//Output the formatted data with header to two separate files
		//output the ordered data and the imperial data to the screen/console,
		//	nicely formatted in rows and labeled columns

		Person Maxwell = new Person("Maxwell", 167, 98.4); //test

		PersonSetOrdered sortedSet = new PersonSetOrdered();
		PersonSetImperial imperialSet = new PersonSetImperial();

		//Tries to find hr.txt and create outputfile.txt, then runs a while loop.
		try
		{
			File file = new File("hr.txt");
			Scanner fileReader = new Scanner(file);
			System.out.println(fileReader.nextLine()); //prints header into the console

			try
			{

				FileWriter imperialSetWriter = new FileWriter("hr_imperial_set_output.txt");
				FileWriter orderedSetWriter = new FileWriter("hr_ordered_set_output.txt");

				//Scans each line, pulls name, height, weight and creates a new person object w/ them
				//then prints that person.toString(), and adds that person to an ArrayList<Person>
				//After finished scanning, calls the ArrayList<Person>.toString() and writes that to output.txt
				while(fileReader.hasNext())
				{
					String name = fileReader.next();
					double height = fileReader.nextDouble();
					double weight = fileReader.nextDouble();
					Person inputPersonImp = new Person(name, height, weight);
					Person inputPersonSort = new Person(name, height, weight);
					//System.out.print(inputPersonSort.toString()); //Only here for console output, will print duplicates
					imperialSet.personAdd(inputPersonImp);
					sortedSet.personAdd(inputPersonSort);
				}
				System.out.println("Creating Output Files...");
				imperialSetWriter.write(imperialSet.toString());
				orderedSetWriter.write(sortedSet.toString());
				imperialSetWriter.close();
				orderedSetWriter.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
				System.out.println(e);
				System.exit(1);
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
