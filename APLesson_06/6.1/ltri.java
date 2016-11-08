import java.util.Scanner;

public class ltri
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter word: ");
		String word = kb.next();
		for(int i = 0; i <= word.length(); i++)
		{
			System.out.println(word.substring(i));
		}
	}
}