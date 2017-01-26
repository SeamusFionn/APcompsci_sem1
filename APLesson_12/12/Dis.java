import java.lang.Math.*;

public class Dis
{
	private int x1, x2, y1, y2;
	private double distance;
	
	public Dis()
	{
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		
		distance = 0;
	}
	
	public Dis(int xone, int xtwo, int yone, int ytwo)
	{
		x1 = xone;
		x2 = xtwo;
		y1 = yone;
		y2 = ytwo;
		
		distance = 0;
	}

	public double getDis()
	{
		distance = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
		return distance;
	}
}