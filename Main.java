/*
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

//1 kg = 2.20462 lbs
//1 cm = .393701

public class Main 
{
	public static void main(String[] args) 
	{

		Person Maxwell = new Person("Maxwell", 167, 98.4); //test

		PersonSet javaClass = new PersonSet(); //test?

		try
		{

			File file = new File("hr.txt");
			Scanner fileReader = new Scanner(file);
			System.out.println(fileReader.nextLine()); //prints header into the console
			try
			{

				FileWriter fileWriterOrder = new FileWriter("outputfile.txt");

				while(fileReader.hasNext())
				{
					String name = fileReader.next();
					double height = fileReader.nextDouble();
					double weight = fileReader.nextDouble();
					Person inputPerson = new Person(name, height, weight);
					System.out.print(inputPerson.toString()); //Only here for console output, will print duplicates
					javaClass.personAdd(inputPerson); //This method checks for duplicates and does NOT add them to the ArrayList<Person>
				}
				System.out.println("Creating Output File...");
				fileWriterOrder.write(javaClass.toString());
				System.out.println("Duplicates Found: " + javaClass.duplicateGet());
				fileWriterOrder.close();
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
