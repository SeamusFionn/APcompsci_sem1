import java.util.Scanner;

public class factorial 
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your number? ");
		int number = kb.nextInt();
		int factorial = 1;
		//factorial equals 1
		for(int i = 1; i <= number; i++)
		//factorial 
		{
			factorial = i * factorial; 
			System.out.println("your factorial is " + factorial);
		}
	}
}