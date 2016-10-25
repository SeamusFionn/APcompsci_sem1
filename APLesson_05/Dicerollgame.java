public class Dicerollgame{
	public static void main(String[]args){
		int pnum = 1 + (int)((Math.random()*6));
		System.out.println("Your number is: " + pnum);
		int cnum = 1 + (int)((Math.random()*6));
		System.out.println("Computers number is: " + cnum);
		boolean pwinner = pnum > cnum;
		boolean cwinner = cnum > pnum;
		boolean pctie = cnum == pnum;
		if (pwinner)
			System.out.println("You Win!");
		if (cwinner)
			System.out.println("You lose!");
		if (pctie)
			System.out.println("Its a Tie!");
	}
}