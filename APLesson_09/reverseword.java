import java.util.Scanner;

public class reverseword
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
		
		for (String word : words)
		{
			System.out.println("\"" + word + "\", ");
		}
		
		for (String word : words)
		{
			String reverse = "";
			for (int i = word.length(); i > 0; i--)
			{
				reverse += word.substring(i-1, i);
			}
			System.out.println(reverse);
		}
	}
}