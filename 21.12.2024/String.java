import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // Clear the newline character from the buffer
        String s = scanner.nextLine();

        // Print outputs
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scanner.close(); // Close the scanner
    }
}

