package appDomain;

import java.io.*;
import java.util.*;

import shapes.*;
import shapes.Shape;
import utilities.*;

public class AppDriver
{	
	public static void main( String[] args )
	{
		if (args.length < 3) 
		{
            System.out.println("Usage: java -jar Sort.jar -f<file_name> -t<criterion> -s<algorithm>");
            return;
        }
		
		String fileName = null;
		char sortCriterion = 'h';
        char sortAlgorithm = 'b'; 
        
		//Checks command line arguments
        for (String arg : args) 
        {
            if (arg.startsWith("-f")) 
            {
                fileName = arg.substring(2);
            } 
            else if (arg.startsWith("-t")) 
            {
                sortCriterion = arg.charAt(2);
            } 
            else if (arg.startsWith("-s")) 
            {
                sortAlgorithm = arg.charAt(2);
            }
        }
        
        if (fileName == null) {
            System.out.println("Error: No input file specified.");
            return;
        }
		 
        //Read file
		ArrayList<Shape> shapes = (ArrayList<Shape>) readShapesFromFile(fileName);	
		if (shapes == null || shapes.isEmpty()) 
		{
            System.out.println("Error: No shapes found in file.");
            return;
        }
			
		// Select comparator based on sortCriterion
		Comparator<Shape> comparator;
        if (sortCriterion == 'v') 
        {
            comparator = Shape.VOLUME_COMPARATOR;
        } 
        else if (sortCriterion == 'a') 
        {
            comparator = Shape.BASE_AREA_COMPARATOR;
        } 
        else 
        {
            comparator = Comparator.naturalOrder();
        }
     
        //Sort and time the execution
        long startTime = System.nanoTime();
        
        if (sortAlgorithm == 'b') 
        {
            BubbleSort.sort(shapes, comparator);
        } 
        else if (sortAlgorithm == 's') 
        {
            SelectionSort.sort(shapes, comparator);
        } 
        else if (sortAlgorithm == 'i') 
        {
            InsertionSort.sort(shapes, comparator);
        } 
        else if (sortAlgorithm == 'm') 
        {
            MergeSort.sort(shapes, comparator);
        } 
        else if (sortAlgorithm == 'q') 
        {
            QuickSort.sort(shapes, comparator);
        } 
        else if (sortAlgorithm == 'z') 
        {
            Heap.sort(shapes, comparator);
        } 
        else 
        {
            System.out.println("Error: Invalid sorting algorithm selected.");
        }
        
        long endTime = System.nanoTime();

        //Display results
        System.out.println("Sorting completed in " + (endTime - startTime) / 1_000_000.0 + " ms.");
        printSortedShapes(shapes);
	}
	
	private static List<Shape> readShapesFromFile(String fileName) 
	{
        List<Shape> shapes = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) 
        {
            int numShapes = Integer.parseInt(br.readLine().trim());
            
            for (int i = 0; i < numShapes; i++) 
            {
                String line = br.readLine();
                
                if (line != null) 
                {
                    Shape shape = ShapeFactory.createShape(line);
                    
                    if (shape != null) 
                    {
                    	shapes.add(shape);
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        return shapes;
    }

    private static void printSortedShapes(List<Shape> shapes) 
    {
    	if (shapes == null || shapes.isEmpty()) 
    	{
            System.out.println("No shapes to display.");
            return;
        }
    	
        System.out.println("First shape: " + shapes.get(0));
        
        for (int i = 1000; i < shapes.size(); i += 1000) 
        {
            System.out.println("Shape at " + i + ": " + shapes.get(i));
        }
        
        System.out.println("Last shape: " + shapes.get(shapes.size() - 1));
    }

}
