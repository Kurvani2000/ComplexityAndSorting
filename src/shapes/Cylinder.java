package shapes;

public class Cylinder
{
	double height;
	double radius;
	
	double calcBaseArea()
	{
		return Math.pow(2, this.radius) * 3.14;
	}
	
	double calcVolume()
	{
		return 3.14 * Math.pow(2, this.radius)  * this.height;
	}
}
