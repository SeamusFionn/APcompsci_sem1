import java.util.Scanner;

public class replaceats
{
	static String sentence;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("please enter a sentence: ");
		sentence = kb.nextLine();
		
		replace();
	}
	public static void replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
		}
		
		System.out.println("With replaced a's.... " + sentence);
	}
}

