import java.util.Scanner;

public class HumanRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter hair: ");
		String Hair = kb.nextLine();
		
		System.out.println("Enter eyes: ");
		String Eyes = kb.nextLine();
		
		System.out.println("Enter skin: ");
		String Skin = kb.nextLine();
		
		Human object = new Human(Hair, Eyes, Skin);
		System.out.println("Human Information- ");
		System.out.println("Hair-    " + object.getHair());
		System.out.println("Eyes-    " + object.getEyes());
		System.out.println("Skin-    " + object.getSkin());
		//added an extra line because it was annoying me
		Human object2 = new Human("Brown", "Black", "Tan");
		System.out.println("\nFriend Information- ");
		System.out.println("Hair-    " + object2.getHair());
		System.out.println("Eyes-    " + object2.getEyes());
		System.out.println("Skin-    " + object2.getSkin());
	}
}