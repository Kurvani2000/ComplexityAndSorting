package utilities;

import java.util.Comparator;
import java.util.List;
import shapes.Shape;

public class BubbleSort 
{
	public static void sort(List<Shape> shapes, Comparator<Shape> comparator) 
	{
		if (shapes == null || comparator == null) 
		{
			throw new IllegalArgumentException("Shapes list and comparator must not be null.");
	    }
		 
		int n = shapes.size();
	    boolean swapped = false;
		 
		for (int i = 0; i < n - 1; i++) 
        {
            for (int s = 0; s < (n - 1 - i); s++) 
            {
            	if (comparator.compare(shapes.get(s), shapes.get(s + 1)) < 0) 
            	{
            		//Swap shapes if they are in the wrong order
                    Shape temp = shapes.get(s);
                    shapes.set(s, shapes.get(s + 1));
                    shapes.set(s + 1, temp);
                    
                    swapped = true;
            	}
            }
            
            //If no elements were swapped, the list is already sorted
            if (!swapped) 
            {
                break;
            }
        }
	}
}
