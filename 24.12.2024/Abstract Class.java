import java.util.*;
abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String title = scanner.nextLine();
        scanner.close();

        MyBook myBook = new MyBook();
        myBook.setTitle(title);

        System.out.println("The title is: " + myBook.getTitle());
    }
}
