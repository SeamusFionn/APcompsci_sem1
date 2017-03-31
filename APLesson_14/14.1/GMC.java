import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GMC extends Car
{
	private double xpo, ypo;	
	public GMC()
	{
		super();
		xpo = 0;
		ypo = 0;		
	}	
	public GMC(double x, double y)
	{
		super();
		xpo = x;
		ypo = y;
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
		double location[]=new double[2];
		location[0] = xpo;
		location[1] = ypo;
		return location;
	}
}