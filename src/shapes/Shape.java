package shapes;

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
}
