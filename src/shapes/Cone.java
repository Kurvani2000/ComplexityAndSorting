package shapes;

public class Cone
{
	double height;
	double radius;
	
	double calcBaseArea()
	{
		return Math.pow(2, this.radius) * 3.14;
	}
	
	double calcVolume()
	{
		return 3.14 / 3 * Math.pow(2, this.radius)  * this.height;
	}
}
