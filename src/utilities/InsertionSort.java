package utilities;

public class InsertionSort 
{
	static void insertionSort(int arr[]) 
	{
		for (int i = 1; i < arr.length; ++i) 
        {
            int key = arr[i];
            int s = i - 1;

            while (s >= 0 && arr[s] < key) 
            {
                arr[s + 1] = arr[s];
                s = s - 1;
            }
            
            arr[s + 1] = key;
        }
	}
}
