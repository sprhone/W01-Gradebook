import java.util.ArrayList;
import java.util.Scanner;

import Model.GradeBook;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Jan 28, 2021
 */
public class StartProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		
		System.out.print("Would you like to add another test and scores to the GradeBook?  [Y or N]  ");
		String addAnother = in.next();
		
		while (!addAnother.equalsIgnoreCase("n"))
		{
			GradeBook currentGB = new GradeBook();

			System.out.print("\nWhat is the test name?  ");
			currentGB.setTestName(in.next());
		
			System.out.print("How many scores would you like to input?  ");
			setScores(in.nextInt(), currentGB);
			
			System.out.println("\nTest Name:  " + currentGB.getTestName());
			System.out.println("Score -------- Grade");
			for (int i = 0; i < currentGB.getTestScores().size(); i++)
				{
					System.out.println("  " + currentGB.getTestScores().get(i) + "  --------   " + currentGB.getLetterGrades().get(i));
				}
			
			System.out.print("\nWould you like to add another test and scores to the GradeBook?  [Y or N]  ");
			addAnother = in.next();
		}
		in.close();
		System.out.println("Thank you for using GradeBook!");
	}

	public static void setScores (int numberOfScores, GradeBook tempGB)
	{
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		
		for (int i = 0; i < numberOfScores; i++)
		{
			Scanner in = new Scanner (System.in);

			System.out.print("Enter a score:  ");
			tempArray.add(in.nextInt());			
		}
		tempGB.setTestScores(tempArray);
		tempGB.setLetterGrades(tempArray);
	}
}
