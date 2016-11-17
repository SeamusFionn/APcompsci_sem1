import java.util.Scanner;

public class avgdigit
{
	static int number;
	static int digits = 0;
	static int avg = 0;
	static int num;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter number: ");
		number = kb.nextInt();
		avgDigits();
		avg = avg / digits;
		System.out.println("The avg of the digits in " + number + " is " + avg);
	}
	public static void avgDigits()
	{
		num = number;
		while(num > 0)
		{
			digits += 1;
			avg += num % 10;
			num /= 10;
			
		}
	}
}



