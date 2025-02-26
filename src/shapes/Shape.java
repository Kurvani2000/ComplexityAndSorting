package shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>
{
	double height;
	
	public double getHeight()
	{
		return height;
	}
	
	public Shape(double height)
	{
		this.height = height;
	}
	
	abstract double calcVolume();
	abstract double calcBaseArea();
	
	public int compareTo(Shape s)
	{
		if ( this.getHeight() > s.getHeight() ) return 1;
		else if ( this.getHeight() < s.getHeight() ) return -1;
		else return 0;
	}
	
	public int compare(Shape s1, Shape s2)
	{
		int difference = (int) (s1.calcVolume() - s2.calcVolume() - s1.calcBaseArea() - s2.calcBaseArea());
		
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
