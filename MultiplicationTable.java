import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();
        
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("\nMultiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
             
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();  
        }

        scanner.close();
    }
}