import java.util.Scanner;

public class countx
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please input a number ");
		int firstnum = kb.nextInt();
		System.out.println("please enter another number ");
		int secondnum = kb.nextInt();
		for(int i = firstnum; i <= secondnum; i+=2)
		{
			System.out.println(i);
		}
	}
}