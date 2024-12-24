import java.lang.reflect.Method;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;

        Method[] methods = studentClass.getDeclaredMethods();

        List<String> methodNames = new ArrayList<>();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        Collections.sort(methodNames);

        for (String name : methodNames) {
            System.out.println(name);
        }
    }
}
