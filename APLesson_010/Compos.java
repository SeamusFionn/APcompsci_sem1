import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Compos
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		System.out.println(nums);
	}
	
	public static int gFactor(int n)
	{
		for (int i = 0; i < n; i++)
		{
			if (n % i == 0)
			{
				return 1;
			}
			
			else
			{
				return 0;
			}
		}
	}
	
	public static int removePrimes(ArrayList(nums))
	{
		for (int i = 0; i < nums.length; i++)
		{
			if (gFactor(nums.get(i) == 0))
			{
				nums.remove(i);
				i -= 1;
			}
		}
		
	}
}