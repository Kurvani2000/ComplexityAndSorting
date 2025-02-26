package shapes;

public class Pyramid extends Shape
{
	double side;
	
	double getSide()
	{
		return side;
	}
	
	public Pyramid(double height) 
	{
		super(height);
	}
	
	double calcBaseArea()
	{
		return Math.pow(2, this.side);
	}
	
	double calcVolume()
	{
		return Math.pow(2, this.side) / 3  * this.height;
	}
}
