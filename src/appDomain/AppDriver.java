package appDomain;

public class AppDriver
{
	public static void bubbleSort(Integer[] nums) 
	{
		int n = nums.length;
        
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
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
	
	public static void insertionSort(Integer[] nums) 
	{
		
	}
	
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

	}

}
