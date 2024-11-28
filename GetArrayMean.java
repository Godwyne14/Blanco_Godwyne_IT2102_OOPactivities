import java.util.Scanner;

public class GetArrayMean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of elements
        System.out.print("Enter number of elements: ");
        int numberOfElements = scanner.nextInt();

        // Create an array to store the integers
        int[] numbers = new int[numberOfElements];

        // Populate the array with user input
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate and display the mean
        double mean = getArrayMean(numbers);
        System.out.printf("Mean of array is: %.2f\n", mean);

        scanner.close();
    }
    public static double getArrayMean(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }
}

