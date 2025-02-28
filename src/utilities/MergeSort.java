package utilities;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Utility to sort an array via merge sort.
 */
public class MergeSort {
	
	/**
	 * Sorts an array of Comparable objects via merge sort.
	 * 
	 * param array Array to be sorted. Objects in the array must implement the Comparable interface.
	 * 
	 * return void. Input array will be altered.
	 */
    public static <T> void mergeSort(Comparable<T>[] array) {
        if (array.length < 2) {
            return; // An array of zero or one element is already sorted
        }

        int mid = array.length / 2;
        Comparable[] left = new Comparable[mid];
        Comparable[] right = new Comparable[array.length - mid];

        // Split the array into two halves
        for (int i = 0; i < mid; i++) {
            left[i] = (Comparable<T>) array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = (Comparable<T>) array[i];
        }

        // Sort both halves
//        Arrays.sort(left);
//        Arrays.sort(right);
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
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
    public static <T> void merge(Comparable<T>[] array, Comparable<T>[] left, Comparable<T>[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (((Comparable<T>) left[i]).compareTo((T) right[j]) < 1) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    
	/**
	 * Sorts an array of Comparable objects via merge sort using the c Comparator.
	 * 
	 * param array Array to be sorted. Objects in the array must implement the Comparable interface.
	 * param c Comparator object. Must implement a compare() function that compares two members of array.
	 * 
	 * return void. Input array will be altered.
	 */
    public static <T> void mergeSort(Comparable<T>[] array, Comparator<? super T> c) {
        if (array.length < 2) {
            return; // An array of zero or one element is already sorted
        }

        int mid = array.length / 2;
        Comparable[] left = new Comparable[mid];
        Comparable[] right = new Comparable[array.length - mid];

        // Split the array into two halves
        for (int i = 0; i < mid; i++) {
            left[i] = (Comparable<T>) array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = (Comparable<T>) array[i];
        }

        // Sort both halves
//        Arrays.sort(left, (Comparator) c);
//        Arrays.sort(right, (Comparator) c);
        mergeSort(left, c);
        mergeSort(right, c);

        // Merge the sorted halves
        merge(array, left, right, c);
    }

    /**
     * Helper method to merge two arrays of Comparable objects using the c Comparator.
     * 
     * param array Array to hold merged objects.
     * param left Array to be merged. Objects in the array must implement the Comparable interface.
     * param right Array to be merged. Objects in the array must implement the Comparable interface.
     * param c Comparator object. Must implement a compare() function that compares two members of "left" and "right".
     * 
     * return void. Input "array" will be altered to store the merged result.
     */
    public static <T> void merge(Comparable<T>[] array, Comparable<T>[] left, Comparable<T>[] right, Comparator<? super T> c) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (c.compare((T) left[i], (T) right[i]) < 1 ) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}