public class Bignumber
{
	static int[] numbers = new int[10];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers... "); 
		printArray();
		System.out.print("There biggest number is " + getBiggest());
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static int getBiggest()
	{
		int max = 0;
		for(int num : numbers)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}
}