import java.util.Scanner;

public class SeriesCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int q = scanner.nextInt();

    
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

        
            int term = a;
            for (int j = 0; j < n; j++) {
                term += (int) Math.pow(2, j) * b;
                System.out.print(term + " ");
            }

            // Move to the next line after each series
            System.out.println();
        }

        scanner.close();
    }
}
