import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Honda extends Car
{
	private double xpo,ypo;
	public Honda(double[] honLoc)
	{
		super();
		xpo = honLoc[0];
		ypo = honLoc[1];
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
		double[] location = new double[2];
		location[0] = xpo;
		location[1] = ypo;
		return location;
	}
}