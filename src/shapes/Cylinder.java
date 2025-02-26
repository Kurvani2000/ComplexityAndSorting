package shapes;

public class Cylinder extends Shape
{
	double radius;
	
	public double getRadius()
	{
		return radius;
	}
	
	public Cylinder(double height) 
	{
		super(height);
	}
	
	double calcBaseArea()
	{
		return Math.pow(2, this.radius) * 3.14;
	}
	
	double calcVolume()
	{
		return 3.14 * Math.pow(2, this.radius)  * this.height;
	}
}
