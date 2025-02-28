package utilities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import shapes.Shape;

public class MergeSort 
{
	/**
	 * Sorts an array of Comparable objects via merge sort.
	 * 
	 * param array Array to be sorted. Objects in the array must implement the Comparable interface.
	 * 
	 * return void. Input array will be altered.
	 */
    public static void sort(List<Shape> shapes, Comparator<Shape> comparator) 
    {
        if (shapes.size() < 2) 
        {
            return; // An array of zero or one element is already sorted
        }

        int mid = shapes.size() / 2;
        
        List<Shape> left = new ArrayList<>(shapes.subList(0, mid));
		List<Shape> right = new ArrayList<>(shapes.subList(mid, shapes.size()));

        //Sort both halves
        sort(left, comparator);
        sort(right, comparator);

        //Merge the sorted halves
        merge(shapes, left, right, comparator);
    }

    /**
     * Helper method to merge two arrays of Comparable objects.
     * 
     * param array Array to hold merged objects.
     * param left Array to be merged. Objects in the array must implement the Comparable interface.
     * param right Array to be merged. Objects in the array must implement the Comparable interface.
     * 
     * return void. Input "array" will be altered to store the merged result.
     */
    private static void merge(List<Shape> shapes, List<Shape> left, List<Shape> right, Comparator<Shape> comparator) 
    {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) 
        {
			if (comparator.compare(left.get(i), right.get(j)) >= 0) 
			{
				shapes.set(k++, left.get(i++));
			} 
			else 
			{
				shapes.set(k++, right.get(j++));
			}
		}

		//Copy remaining elements of left
		while (i < left.size()) 
		{
			shapes.set(k++, left.get(i++));
		}

		//Copy remaining elements of right
		while (j < right.size()) 
		{
			shapes.set(k++, right.get(j++));
		}
    }
}