import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toyinv> toylist = new ArrayList<Toyinv>();
	
	public ToyStore()
	{
		loadToys("there are no toys");
	}
	
	public ToyStore(String toylist)
	{
		loadToys(toylist);
	}
	
	public void loadToys(String ts)
	{
		String[] toys = ts.split(", ");
		toylist = new ArrayList<Toyinv>();
		for(int i = 0; i < toys.length; i+=2 )
		{
			String name = toys[i];
			String type = toys[i+1];
			Toyinv object3 = (getThatToy(name));
			if(getThatToy(name) == null)
			{
				if(type.equals("Car")) 
				{
					toylist.add(new Car(name));	
				}
				if(type.equals("AF"))
				{
					toylist.add(new Afigure(name));
				}
			}
			else
				{
					getThatToy(name).addCount();
				}
		}
	}
	
	public Toyinv getThatToy(String nm)
	{
		for(int i = 0; i < toylist.size(); i++ )
		{
			Toyinv t = toylist.get(i);
			
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}

	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < toylist.size(); i++ )
		{
			Toyinv t = toylist.get(i);
			
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(int i = 0; i < toylist.size(); i++ )
		{
			String name = toylist.get(i).getType();
			
			if(name.equals("Car"))
			{
				cars += 1;
			}
			if(name.equals("AF"))
			{
				figures += 1;
			}
		}
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	public String toString()
	{
		return toylist.toString();
	}
}











