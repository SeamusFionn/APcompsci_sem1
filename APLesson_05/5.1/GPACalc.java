import java.util.Scanner;

public class GPACalc
{
	static String math, science, english, history, elective, language, PE;
	public static void main(String[]args)
	{
		//user inputs for 7 letter grades
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter all grades with a capital number");
		System.out.println("If you have an A in an AP class use AA for your grade");
		System.out.println("What is your math grade?");
		math = keyboard.next();
		System.out.println("What is your science grade?");
		science = keyboard.next();
		System.out.println("What is your english grade?");
		english = keyboard.next();
		System.out.println("What is your history grade?");
		history = keyboard.next();
		System.out.println("What is your elective grade?");
		elective = keyboard.next();
		System.out.println("What is your language grade?");
		language = keyboard.next();
		System.out.println("What is your PE grade?");
		PE = keyboard.next();
		
		double gPoints = (calcPoints(math) + calcPoints(science) + calcPoints(english) + calcPoints(history) + calcPoints(elective) + calcPoints(language) + calcPoints(PE))/7;
	
		//print out gpa = gpoints / total # of grades
		
		System.out.println("Your GPA is ...." + gPoints);
	}
	
	public static double calcPoints(String grade)
	{
		double gradepoints = 0.0;
	if (grade.equals("AA"))
		return 5.0;
	if (grade.equals("A"))
		return 4.0;
	if (grade.equals("B"))
		return 3.0;
	if (grade.equals("C"))
		return 2.0;
	if (grade.equals("D"))
		return 1.0;
	if (grade.equals("F"))
		return 0.0;
	
	return 0.0;
	}
}