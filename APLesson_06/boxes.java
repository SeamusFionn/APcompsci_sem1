import java.util.Scanner;

public class boxes 
{
	static String string;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter word: ");
		string = kb.next();
		for(int i = 0; i < string.length(); i++)
		{
			System.out.println(string);
		}
		
	}
}