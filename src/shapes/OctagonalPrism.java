package shapes;

public class OctagonalPrism
{
	double height;
	double side;
	
	double calcBaseArea()
	{
		return 2 * (1 + Math.sqrt(2)) * Math.pow(2, this.side);
	}
	
	double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}
}
