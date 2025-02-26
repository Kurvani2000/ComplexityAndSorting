package shapes;

import java.util.Comparator;

public abstract class Prism implements Comparable<Prism>
{
	double height;
	double side;
	
	public double getHeight()
	{
		return height;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public Prism(double height, double side)
	{
		this.height = height;
		this.side = side;
	}
	
	abstract double calcVolume();
	abstract double calcBaseArea();
	
	public int compareTo(Prism p)
	{
		if ( this.getHeight() > p.getHeight() ) return 1;
		else if ( this.getHeight() < p.getHeight() ) return -1;
		else return 0;
	}
	
	public int compare(Prism p1, Prism p2)
	{
		int difference = (int) (p1.calcVolume() - p2.calcVolume() - p1.calcBaseArea() - p2.calcBaseArea());
		
		if (difference == 0) 
		{
			return 0;
	    }
	    else if (difference < 0) 
	    {
	         return -1;
	    }
	    else 
	    {
	         return 1;
	    }   
	}
}
