package shapes;

public class Cone extends Shape
{
	private double height, radius;
	
	public Cone(double height, double radius) 
	{
		this.height = height;
        this.radius = radius;
	}
	
	@Override
	public double getHeight() 
	{
		return height;
	}
	
	@Override
	public double calcBaseArea()
	{
		return Math.pow(2, this.radius) * 3.14;
	}
	
	@Override
	public double calcVolume()
	{
		return 3.14 / 3 * Math.pow(2, this.radius)  * this.height;
	}
}
