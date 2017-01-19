import java.util.Scanner;

public class Strings
{
	public static void main(String[]args)
	{
	//	Scanner kb = new Scanner(System.in);
		String[][]words = new String [4][4];
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
		        Scanner kb = new Scanner(System.in);
				System.out.println("Please enter a word");
				i = kb.nextInt();
				System.out.println("Please enter a word");
				j = kb.nextInt();
			}
		}
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j]);
			}
			System.out.println();
		}	
	}
}




