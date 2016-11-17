import java.util.Scanner;

public class digitadd
{
	static int number;
	static int sum = 0;
	static int num;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter number: ");
		number = kb.nextInt();
		
		sumDigits();
		
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits()
	{
		num = number;
		while(num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
	}
}





















