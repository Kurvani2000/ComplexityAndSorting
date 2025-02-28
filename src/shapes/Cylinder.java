package shapes;

public class Cylinder extends Shape
{
	private double height, radius;
	
	public Cylinder(double height, double radius) 
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
		return 3.14 * Math.pow(2, this.radius)  * this.height;
	}
}
