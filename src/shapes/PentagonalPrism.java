package shapes;

public class PentagonalPrism extends Shape
{
	private double height, side;
	
	public PentagonalPrism(double height, double side) 
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
		return (5 * Math.pow(2, this.side) * Math.tan(54)) / 4;
	}
	
	@Override
	public double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}
}
