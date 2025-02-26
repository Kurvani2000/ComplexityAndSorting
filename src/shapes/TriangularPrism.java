package shapes;

public class TriangularPrism extends Prism
{
	public TriangularPrism(double height, double side) 
	{
		super(height, side);
	}
	
	double calcBaseArea()
	{
		return Math.pow(2, this.side) * 3.14;
	}
	
	double calcVolume()
	{
		return calcBaseArea() * this.height;
	}
}
