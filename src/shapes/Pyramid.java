package shapes;

public class Pyramid
{
	double height;
	double side;
	
	double calcBaseArea()
	{
		return Math.pow(2, this.side);
	}
	
	double calcVolume()
	{
		return Math.pow(2, this.side) / 3  * this.height;
	}
}
