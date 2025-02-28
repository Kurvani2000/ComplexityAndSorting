package shapes;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape>
{	
	public abstract double getHeight();
	public abstract double calcVolume();
	public abstract double calcBaseArea();
	
	@Override
	public int compareTo(Shape s)
	{
		if (this.getHeight() > s.getHeight())
		{
			return 1;
		}
		else if (this.getHeight() < s.getHeight())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	 // Static Comparator for Volume
    public static final Comparator<Shape> VOLUME_COMPARATOR = new Comparator<Shape>() 
    {
        @Override
        public int compare(Shape s1, Shape s2) 
        {
            return Double.compare(s1.calcVolume(), s2.calcVolume());
        }
    };

    // Static Comparator for Base Area
    public static final Comparator<Shape> BASE_AREA_COMPARATOR = new Comparator<Shape>() 
    {
        @Override
        public int compare(Shape s1, Shape s2) 
        {
            return Double.compare(s1.calcBaseArea(), s2.calcBaseArea());
        }
    };
}
