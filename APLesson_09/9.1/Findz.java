import java.util.Scanner;

public class Findz
{
	static String [] words;
	
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		System.out.println("For the words ");
		printArray();
		System.out.print("Only " + hasZs() + "contain the letter z. ");
	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for (String word : words)
		{
			System.out.print(word + " ");
		}
		System.out.println("");
	}
	
	public static String hasZs()
	{
		String zs = "";
		for (String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
		}
		return zs;
	}
}