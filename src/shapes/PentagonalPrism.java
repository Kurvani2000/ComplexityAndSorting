package shapes;

public class PentagonalPrism extends Prism
{
	public PentagonalPrism(double height, double side) 
	{
		super(height, side);
	}
	
	double calcBaseArea()
	{
		return (5 * Math.pow(2, this.side) * Math.tan(54)) / 4;
	}
	
	double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}
}
