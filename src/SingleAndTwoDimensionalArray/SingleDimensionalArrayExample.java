package SingleAndTwoDimensionalArray;

public class SingleDimensionalArrayExample {
    public static void main(String[] args) {
        // Creating a single-dimensional array of integers
        int[] numbers = new int[5];

        // Storing data in the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Retrieving and printing data from the array using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
            System.out.println();
        }
    }
}
