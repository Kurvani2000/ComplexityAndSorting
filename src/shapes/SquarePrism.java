package shapes;

public class SquarePrism
{
	double height;
	double side;
	
	double calcBaseArea()
	{
		return (Math.pow(2, this.side) * Math.sqrt(3)) / 4;
	}
	
	double calcVolume()
	{
		return calcBaseArea()  * this.height;
	}
}
