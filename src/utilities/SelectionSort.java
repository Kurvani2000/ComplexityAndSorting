package utilities;

import java.util.Comparator;
import java.util.List;
import shapes.Shape;

public class SelectionSort 
{
	public static void sort(List<Shape> shapes, Comparator<Shape> comparator)
	{  
		for (int i = 0; i < shapes.size() - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < shapes.size(); j++){  
                if (comparator.compare(shapes.get(j), shapes.get(index)) > 0)
                {  
                    index = j; //searching for lowest index  
                }  
            }  
            
            Shape smallerNumber = shapes.get(index);
			shapes.set(index, shapes.get(i));
			shapes.set(i, smallerNumber);
        }
    } 
}