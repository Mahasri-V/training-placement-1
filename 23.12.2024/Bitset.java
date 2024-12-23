import java.util.BitSet;
import java.util.Scanner;

public class BitSetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int arg1 = scanner.nextInt();
            int arg2 = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (arg1 == 1) b1.and(b2);
                    else b2.and(b1);
                    break;
                case "OR":
                    if (arg1 == 1) b1.or(b2);
                    else b2.or(b1);
                    break;
                case "XOR":
                    if (arg1 == 1) b1.xor(b2);
                    else b2.xor(b1);
                    break;
                case "FLIP":
                    if (arg1 == 1) b1.flip(arg2);
                    else b2.flip(arg2);
                    break;
                case "SET":
                    if (arg1 == 1) b1.set(arg2);
                    else b2.set(arg2);
                    break;
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        scanner.close();
    }
}
