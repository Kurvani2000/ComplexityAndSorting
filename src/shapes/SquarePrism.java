package shapes;

public class SquarePrism extends Shape
{
	private double height, side;
	
	public SquarePrism(double height, double side) 
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
		return (Math.pow(2, this.side) * Math.sqrt(3)) / 4;
	}
	
	@Override
	public double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}

	
}
