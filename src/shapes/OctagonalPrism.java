package shapes;

public class OctagonalPrism extends Shape
{
	private double height, side;
	
	public OctagonalPrism(double height, double side) 
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
		return 2 * (1 + Math.sqrt(2)) * Math.pow(2, this.side);
	}
	
	@Override
	public double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}
}
