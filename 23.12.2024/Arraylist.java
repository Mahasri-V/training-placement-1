import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list.add(scanner.nextInt());
            }
            lists.add(list);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x <= lists.size() && x > 0 && y <= lists.get(x - 1).size() && y > 0) {
                System.out.println(lists.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
