package shapes;

public class Pyramid extends Shape
{
	private double height, side;
	
	public Pyramid(double height, double side) 
	{
		this.height = height;
        this.side = side;
	}
	
	@Override
	public double getHeight() 
	{
		return height;
	}
	
	@Override
	public double calcBaseArea()
	{
		return Math.pow(2, this.side);
	}
	
	@Override
	public double calcVolume()
	{
		return Math.pow(2, this.side) / 3  * this.height;
	}
}
