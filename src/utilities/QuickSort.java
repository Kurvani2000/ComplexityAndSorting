package utilities;

import java.util.Comparator;
import java.util.List;
import shapes.Shape;

public class QuickSort 
{
	public static void sort(List<Shape> shapes, Comparator<Shape> comparator) 
	{
		if (shapes == null || comparator == null) 
		{
            throw new IllegalArgumentException("Shapes list and comparator must not be null.");
        }
		
        quickSort(shapes, comparator, 0, shapes.size() - 1);
	}
	
	private static void quickSort(List<Shape> shapes, Comparator<Shape> comparator, int low, int high) 
	{
        if (low < high) 
        {
            //Partition the list and get the pivot index
            int pi = partition(shapes, comparator, low, high);

            //Recursively sort the sublists before and after the pivot
            quickSort(shapes, comparator, low, pi - 1);
            quickSort(shapes, comparator, pi + 1, high);
        }
    }
	
	private static int partition(List<Shape> shapes, Comparator<Shape> comparator, int low, int high) 
	{
		Shape pivot = shapes.get(high);
		int i = low - 1;

		for (int j = low; j < high; j++) 
		{
			if (comparator.compare(shapes.get(j), pivot) > 0) 
			{
				i++;

				Shape temp = shapes.get(i);
				shapes.set(i, shapes.get(j));
				shapes.set(j, temp);
			}
		}

		Shape temp = shapes.get(i + 1);
		shapes.set(i + 1, shapes.get(high));
		shapes.set(high, temp);

		return i + 1;
	}

}
