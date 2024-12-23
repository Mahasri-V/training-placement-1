import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class Checker implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.cgpa < s2.cgpa) {
            return 1; 
        } else if (s1.cgpa > s2.cgpa) {
            return -1; 
        } else {
           
            int nameCompare = s1.name.compareTo(s2.name);
            if (nameCompare != 0) {
                return nameCompare;
            } else {
               
                return s1.id - s2.id; 
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, name, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Checker());

        for(Student st: studentList){
            System.out.println(st.name);
        }
    }
}
