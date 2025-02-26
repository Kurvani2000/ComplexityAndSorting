package utilities;

public class InsertionSort 
{
	static void insertionSort(int arr[]) 
	{
		int s = arr.length;
		
        for (int i = 1; i < s; ++i) 
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            arr[j + 1] = key;
        }
	}
}
