import java.util.Scanner;

public class Findz
{
	static String words;
	static String String[] words = new String[5];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the words ");
		printArray();
		System.out.println("Only " + hasZs() + "contain the letter z. ");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.pintln("Enter 5 words");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for (String word : words)
		{
			System.out.print(word);
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for (String word : words)
		{
			if(word.Indexof("z") < 0)
			{
				return word;
			}
			
			if(word.Indexof("z") > 0)
			{
				zs += word;
			}
		}
		reutrn zs;
	}
}