package shapes;

public class TriangularPrism extends Shape
{
	private double height, side;
	
	public TriangularPrism(double height, double side) 
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
		return Math.pow(2, this.side) * 3.14;
	}
	
	@Override
	public double calcVolume()
	{
		return calcBaseArea() * this.height;
	}
}
