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
	
	public int compareTo(Prism s)
	{
		if ( this.getHeight() > s.getHeight() ) return 1;
		else if ( this.getHeight() < s.getHeight() ) return -1;
		else return 0;
	}
}
