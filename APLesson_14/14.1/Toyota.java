import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Toyota extends Car
{
	private int id;
	private double xpo,ypo;
	public Toyota(String po)
	{
		super();
		ArrayList<String> position = new ArrayList<>(Arrays.asList(po.split(", ")));
		double x = Double.parseDouble(position.get(0));
		double y = Double.parseDouble(position.get(1));
		move(x,y);
	}
	public int getID()
	{
		return ID;
	}	
	public void move(double x,double y)
	{
		xpo += x;
		ypo += y;
	}
	public double[] getLoc()
	{
		double [] location = {xpo,ypo};
		return location;
	}
}