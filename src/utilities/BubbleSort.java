package utilities;

public class BubbleSort 
{
	static void bubbleSort(int arr[]) 
	{
		for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int s = 0; s < (arr.length - 1 - i); s++) 
            {
                if (arr[s] < arr[s + 1]) 
                { 
                	int temp = arr[s];
                	
                    arr[s] = arr[s + 1];
                    arr[s + 1] = temp;
                }
            }
        }
	}
}
