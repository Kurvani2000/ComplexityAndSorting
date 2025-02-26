package utilities;

public class BubbleSort 
{
	static void bubbleSort(int nums[]) 
	{
		int b = nums.length;
        
        for (int i = 0; i < b - 1; i++) 
        {
            for (int j = 0; j < b - i - 1; j++) 
            {
                if (nums[j] < nums[j + 1]) 
                { 
                	int temp = nums[j];
                	
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
	}
}
