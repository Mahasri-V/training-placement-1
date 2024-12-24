import java.util.*;

public class Solution {

    public static void func(ArrayList<Object> mylist) {
        Iterator<Object> it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String && element.equals("###")) { 
                break;
            }
        }
        while (it.hasNext()) { 
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        mylist.add(42);
        mylist.add(10);
        mylist.add("###");
        mylist.add("Hello");
        mylist.add("Java");

        func(mylist);
    }
}
