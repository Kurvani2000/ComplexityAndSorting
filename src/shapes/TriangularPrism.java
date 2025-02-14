package shapes;

public class TriangularPrism
{
	double height;
	double side;
	
	double calcBaseArea()
	{
		return Math.pow(2, this.side) * 3.14;
	}
	
	double calcVolume()
	{
		return calcBaseArea() * this.height;
	}
}
