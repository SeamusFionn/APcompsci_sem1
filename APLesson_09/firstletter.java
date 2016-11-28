import java.util.Scanner;

public class firstletter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		System.out.println("Enter 5 words: ");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
	}
	public static String first(String[] words)
	{
		for (String word : words)
		{
			System.out.println(word.substring(0, 1));
		}
		return "";
	}
}