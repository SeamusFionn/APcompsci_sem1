import java.util.Scanner;

public class Treedeg
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = kb.next();
		int stop = word.length();
		int start = 0;
		System.out.println(tree(word, stop, start));
	}
	
	public static String tree(String word, int stop, int start)
	{
		if(start <= stop)
		{
			System.out.println(word.substring(0, start));
			start += 1;
			return tree(word, stop, start);
		}
		else
		{
			return "";
		}
	}
}