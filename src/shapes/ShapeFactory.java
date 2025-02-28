package shapes;

import java.util.Arrays;

public class ShapeFactory 
{

    //Creates a Shape object based on the input string.
    public static Shape createShape(String input) 
    {
        if (input == null || input.trim().isEmpty()) 
        {
            return null;
        }

        //Split the input into parts
        String[] parts = input.trim().split("\\s+");
        if (parts.length < 3) 
        {
            return null;
        }

        String shapeType = parts[0].toLowerCase();
        double height, dimension;

        try 
        {
            height = Double.parseDouble(parts[1]);
            dimension = Double.parseDouble(parts[2]);
        } 
        catch (NumberFormatException e) 
        {
            return null;
        }

        //Create the appropriate shape based on the type
        switch (shapeType) 
        {
            case "cylinder":
                return new Cylinder(height, dimension);
            case "cone":
                return new Cone(height, dimension);
            case "pyramid":
                return new Pyramid(height, dimension);
            case "squareprism":
                return new SquarePrism(height, dimension);
            case "triangularprism":
                return new TriangularPrism(height, dimension);
            case "pentagonalprism":
                return new PentagonalPrism(height, dimension);
            case "octagonalprism":
                return new OctagonalPrism(height, dimension);
            default:
                return null;
        }
    }
}
