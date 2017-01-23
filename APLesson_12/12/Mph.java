import java.lang.Math.*;

public class Mph
{
    //default values for instance vars
    private int distance, hours, minutes;
	private double mph;

    public Mph()
    {
        //default values for instance vars
        distance = 0;
        hours = 0;
        minutes = 0;
		mph = 0;
        //in case no params are entered
    }


    public Mph(int dist, int hrs, int mins)
    { 
        //default values for instance vars
        distance = dist;
        hours = hrs;
        minutes = mins;
		mph = 0;
        //in case no params are entered
    }

    public void setValues(int dist, int hrs, int mins)
    { 
        //default values for instance vars
        distance = dist;
        hours = hrs;
        minutes = mins;
		mph = 0;
        //in case no params are entered
    }
	
	public int getMins()
	{
		return minutes;
	}
	public int distance()
	{
		return distance;
	}
	
	public int hours()
	{
		return hours;
	}

    public double getMPH()
    {
        mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
    }
}