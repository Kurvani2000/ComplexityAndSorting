# Sorting Application - ReadMe

## Overview
This Java application sorts a collection of 3D geometric shapes by specified criteria (height, base area, or volume) using one of six sorting algorithms: Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, or Heap Sort. The application reads shape data from a text file, sorts the shapes, and outputs the results along with the time taken for sorting.

## Requirements
- Java 8 or higher
- Eclipse IDE (optional, for development)
- Command-line interface to run the application

## How to Use
### 1. Running the Application
To run the application, use the following command in the terminal or command prompt:
java -jar Sort.jar -f<file_name> -t<criterion> -s<algorithm>

#### Command Line Arguments:
- `-f<file_name>`: Specifies the input file containing the shape data. Replace `<file_name>` with the path to your file.
- `-t<criterion>`: Specifies the sorting criterion. Replace `<criterion>` with one of the following:
  - `h` for height
  - `a` for base area
  - `v` for volume
- `-s<algorithm>`: Specifies the sorting algorithm. Replace `<algorithm>` with one of the following:
  - `b` for Bubble Sort
  - `s` for Selection Sort
  - `i` for Insertion Sort
  - `m` for Merge Sort
  - `q` for Quick Sort
  - `z` for Heap Sort

#### Example Commands:
- Sort by height using Bubble Sort: 
java -jar Sort.jar -fshapes1.txt -th -sb

- Sort by volume using Quick Sort: 
java -jar Sort.jar -fshapes2.txt -tv -sq

### 2. Input File Format
The input file should follow this format:
- The first line contains the number of shapes.
- Each subsequent line represents a shape and its dimensions. The format for each shape is as follows:
- **Cylinder**: `Cylinder <height> <radius>`
- **Cone**: `Cone <height> <radius>`
- **Pyramid**: `Pyramid <height> <edge_length>`
- **Prism**: `<PrismType> <height> <edge_length>`
  - Prism types: `SquarePrism`, `TriangularPrism`, `PentagonalPrism`, `OctagonalPrism`

#### Example Input File:
3
Cylinder 10.0 5.0
Cone 15.0 7.0
SquarePrism 20.0 10.0

### 3. Output
The application will output:
- The time taken to sort the shapes in milliseconds.
- The first shape, every 1000th shape (if applicable), and the last shape in the sorted list.

#### Example Output:
Sorting completed in 48.27 ms.
First shape: Cylinder Height: 40.0
1000-th shape: Cone Height: 10.0
Last shape: SquarePrism Height: 15.0

### 4. Notes
- Ensure the input file path is correct and accessible.
- The application handles errors such as missing or invalid command-line arguments by displaying appropriate messages.
- For large datasets, ensure your system has sufficient memory and processing power.

## Included Files
- `Sort.jar`: The executable Java Archive file for the sorting application.
- `AppDriver.java`: The main driver class for the application.
- `shapes/`: Contains the shape classes (e.g., `Cylinder.java`, `Cone.java`, etc.).
- `utilities/`: Contains utility classes for sorting algorithms (e.g., `BubbleSort.java`, `QuickSort.java`, etc.).
- `doc/`: Contains the generated Javadoc for the project.