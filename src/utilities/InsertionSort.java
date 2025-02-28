package utilities;

import java.util.Comparator;
import java.util.List;
import shapes.Shape;

public class InsertionSort 
{
	public static void sort(List<Shape> shapes, Comparator<Shape> comparator)
	{
		if (shapes == null || comparator == null) 
		{
			throw new IllegalArgumentException("Shapes list and comparator must not be null.");
	    }
		
		int n = shapes.size();
		
		for (int i = 1; i < n; ++i) 
        {
            Shape key = shapes.get(i);
            int s = i - 1;

            while (s >= 0 && comparator.compare(shapes.get(s), key) < 0) 
            {
            	shapes.set(s + 1, shapes.get(s));
                s--;
            }
            
            shapes.set(s + 1, key);
        }
	}
}
