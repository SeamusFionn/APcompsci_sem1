import java.util.Scanner;

public class graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please input an integer: ");
		int integer = kb.nextInt();
		System.out.println("please enter size: ");
		int s = kb.nextInt();
		System.out.println("int : result");
		System.out.println("------------");
		for(int i = 1; i <= integer; i++)
		{
			System.out.println(i + " | " + integer * i);
		}
		System.out.println("------------");
	}
}