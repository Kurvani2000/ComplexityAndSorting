package shapes;

public class SquarePrism extends Prism
{
	public SquarePrism(double height, double side) 
	{
		super(height, side);
	}
	
	double calcBaseArea()
	{
		return (Math.pow(2, this.side) * Math.sqrt(3)) / 4;
	}
	
	double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}
}
