package utilities;
import java.util.Comparator;
import java.util.Arrays;

/**
 * Utility to sort an array via selection sort.
 */
public class SelectionSort {
	
	/**
	 * Sorts an array of Comparable objects via selection sort.
	 * 
	 * param array Array to be sorted. Objects in the array must implement the Comparable interface.
	 * 
	 * return void. Input array will be altered.
	 */
	public static <T> void selectionSort(Comparable<T>[] array){  
		for (int i = 0; i < array.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (((Comparable<T>)array[j]).compareTo((T) array[index]) == -1 ){  
                    index = j;//searching for lowest index  
                }  
            }  
            Comparable smallerNumber = array[index];   
            array[index] = array[i];  
            array[i] = smallerNumber;  
        }
    } 
	
	/**
	 * Sorts an array of Comparable objects via selection sort using the c Comparator.
	 * 
	 * param array Array to be sorted. Objects in the array must implement the Comparable interface.
	 * param c Comparator object. Must implement a compare() function that compares two members of array.
	 * 
	 * return void. Input array will be altered.
	 */
	public static <T> void selectionSort(Comparable<T>[] array, Comparator<? super T> c){  
		for (int i = 0; i < array.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < array.length; j++){  
                if (c.compare( (T) array[j], (T) array[index]) == -1 ){  
                    index = j;//searching for lowest index  
                }  
            }  
            Comparable smallerNumber = array[index];   
            array[index] = array[i];  
            array[i] = smallerNumber;  
        }
    } 
}