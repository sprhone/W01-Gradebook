package Model;

import java.util.ArrayList;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Jan 28, 2021
 */
public class GradeBook {
	private String testName;
	private ArrayList<Integer> testScores = new ArrayList<Integer>();
	private ArrayList<String> letterGrades = new ArrayList<String>();
	
	public GradeBook() {
		super();
	}

	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public ArrayList<Integer> getTestScores() {
		return testScores;
	}
	public void setTestScores(ArrayList<Integer> testScores) {
		this.testScores = testScores;
	}
	public ArrayList<String> getLetterGrades() {
		return letterGrades;
	}
	public void setLetterGrades(ArrayList<Integer> userInput) {
		String gradeLevel;
		final int HIGHEST_GRADE = 90;
		final int SECOND_HIGHEST_GRADE = 80;
		final int MID_GRADE = 70;
		final int LOW_GRADE = 60;
		
		for (int i = 0; i < userInput.size(); i++)
		{
			if (userInput.get(i) >= HIGHEST_GRADE)
			{
				gradeLevel = "A";
			}
			else if (userInput.get(i) >= SECOND_HIGHEST_GRADE)
			{
				gradeLevel = "B";
			}
			else if (userInput.get(i) >= MID_GRADE)
			{
				gradeLevel = "C";
			}
			else if (userInput.get(i) >= LOW_GRADE)
			{
				gradeLevel = "D";
			}
			else
			{
				gradeLevel = "F";
			}
			this.letterGrades.add(gradeLevel);
		}
	}
	
	
}
