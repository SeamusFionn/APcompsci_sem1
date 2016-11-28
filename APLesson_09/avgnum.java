import java.util.Scanner;

public class avgnum
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
		
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		
		System.out.println("The average of the above numbers is... " + average(numbers));
	}
	
	public static int average(int [] numbers)
	{
		int average = 0;
		
		for(int num : numbers)
		{
			average += num;
		}
		return average /= numbers.length;
	}
}



