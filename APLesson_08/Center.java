import java.util.Scanner;

public class Center
{
	static String w, ww, www;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		w = kb.next();
		System.out.println("Please enter another word: ");
		ww = kb.next();
		System.out.println("Please enter another word: ");
		www = kb.next();
		System.out.println(makeCenter(w));
		System.out.println(makeCenter(ww));
		System.out.println(makeCenter(www));
	}
	
	public static String makeCenter(String word)
	{
		if (word.length() >= 20)
		{
			return word;
		}
		else
		{
			word = " " + word + " ";
			return makeCenter(word);
		}
	}
}