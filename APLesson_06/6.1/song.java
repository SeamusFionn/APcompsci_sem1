import java.util.Scanner;

public class song
{
	public static void main(String[]args)
	{
		sing("Na ", 3);
		sing("Na ", 3);
		sing("Hey ", 2);
		sing("Goodbye! ", 0);
		sing("He'll never love you ", 0);
		sing("The way that I love you ", 0);
		sing("Cause if he did no ", 0);
		sing("No he wouldnt make you cry ", 0);
		sing("He might be thrilling baby but my loves ", 0);
		sing("so dog-gone willing so kiss him ", 0);
		sing("Go on and kiss him goodbye ", 0);
		sing("Na ", 3);
		sing("Na ", 3);
		sing("Hey ", 2);
		sing("Goodbye! ", 0);
	}
	
	public static void sing(String word, int rept)
	{
		for(int i = 0; i <= rept; i++)
		{
			System.out.print(word);
		}
		System.out.println();
	}
}