package shapes;

public class OctagonalPrism extends Prism
{
	public OctagonalPrism(double height, double side) 
	{
		super(height, side);
	}

	double calcBaseArea()
	{
		return 2 * (1 + Math.sqrt(2)) * Math.pow(2, this.side);
	}
	
	double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}
}
