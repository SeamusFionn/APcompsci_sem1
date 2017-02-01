import java.util.Scanner;

public class GG
{
	static int bulletCount, shotCount;
	static int CLIPSIZE = 16;
	static String []clip;
	public static void main(String[]args)
	{
		
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Action: ");
			String A = kb.next();
			if (A.equals("r"))
			{
				reload();
			}
			if (A.equals("s"))
			{
				shoot();
			}
			printClip();
		}
		System.out.println("Out of bullets!!!");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static void shoot()
	{
		if (shotCount > 0)
		{
			//shotCount-1
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			System.out.println("Boom!!!");
		}
		else
		{
			System.out.println("Reload!!!");
		}
	}
	
	public static void reload()
	{
		if (bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static void printClip()
	{
		String output = " ";
		//Add “Bullets: + tab + bulletCount + newLine + “Clip:” + tab
		output = "Bullets: \t" + bulletCount + "\n" + "Clips: \t";
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
		
	}
}







