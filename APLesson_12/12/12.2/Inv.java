import java.util.Random;

public class Inv
{
	private String itmmancufacturer, itemName, cat;
	private int UPC;
	private double price;
	public Inv(String IM, String I)
	{
	   itmmancufacturer = IM;
	   itemName = I;
	   cat = "____";
	   UPC = (int)(Math.random() * 1000000);
	   price = 0;
	}
	public Inv(String IM, String I, String C, double P)
	{
	   itmmancufacturer = IM;
	   itemName = I;
	   cat = C;
	   UPC = (int)(Math.random() * 1000000);
	   price = P;
	}	
	public String toString()
	{
	   return "\nItem Information- " + "\nManufacturer-   " + itmmancufacturer + "\nItem-           " + itemName + "\nCategory-       " + cat + "\nUPC#-           " + UPC + "\nPrice-          $" + price;
	}	
}