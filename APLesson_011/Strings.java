import java.util.Scanner;

public class Strings
{
	public static void main(String[]args)
	{
		String[][]words = new String [4][4];
		
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[i].length; j++)
			{
				System.out.println("Please enter a word");
				
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




//(int)(Math.random()*50 + 1);
//letters.substring(spot, spot + 1);