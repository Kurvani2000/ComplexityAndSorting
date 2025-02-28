package utilities;

import java.util.Comparator;
import java.util.List;
import shapes.Shape;

public class QuickSort 
{
	public void sort(List<Shape> shapes, Comparator<Shape> comparator, int low, int high) 
	{
		if (low < high) 
		{
			int pi = partition(shapes, comparator, low, high);

			sort(shapes, comparator, low, pi - 1);
			sort(shapes, comparator, pi + 1, high);
		}
	}
	
	private int partition(List<Shape> shapes, Comparator<Shape> comparator, int low, int high) 
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
