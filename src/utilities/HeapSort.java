package utilities;

import java.util.Comparator;
import java.util.List;
import shapes.Shape;

public class HeapSort 
{
	public static void sort(List<Shape> shapes, Comparator<Shape> comparator) 
	{
		int n = shapes.size();

		//builds max heap. the largest element is at index 0 or root of heap.
		for (int i = n / 2 - 1; i >= 0; i--) 
		{
			heapify(shapes, n, i, comparator);
		}

		//extracts the max element from heap. stores it at the end of the array.
		for (int i = n - 1; i > 0; i--) 
		{
			Shape temp = shapes.get(0);
			shapes.set(0, shapes.get(i));
			shapes.set(i, temp);

			heapify(shapes, i, 0, comparator);
		}
	}
	
	//heapify works by reducing the heap size by 1 and then calling heapify
	//on the root element of the heap. The root element is the largest element in the heap.
	//this is done recursively until the heap size is 1. The prupose of heapify is to maintain
	//the maxheap property.
	private static void heapify(List<Shape> shapes, int n, int i, Comparator<Shape> comparator) 
	{
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && comparator.compare(shapes.get(left), shapes.get(largest)) > 0) 
		{
			largest = left;
		}

		if (right < n && comparator.compare(shapes.get(right), shapes.get(largest)) > 0) 
		{
			largest = right;
		}

		if (largest != i) 
		{
			Shape swap = shapes.get(i);
			shapes.set(i, shapes.get(largest));
			shapes.set(largest, swap);

			heapify(shapes, n, largest, comparator);
		}
	}
}
