import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

class Student {
    int marks;
    int age;
    String name;

    public Student(int age, int marks, String name) {
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name : " + name + " Age : " + age + " Marks : " + marks;
    }
}

// class Alpha implements Comparator<Student> {
// public int compare(Student a, Student b) {
// return a.age > b.age ? 1 : -1;
// }
// }

public class Comaparable {
    public static void main(String[] args) {
        Student s1 = new Student(25, 90, "Aman");
        Student s2 = new Student(19, 85, "Ankit");
        Student s3 = new Student(21, 95, "Anuj");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        // Alpha a = new Alpha();

        // Comparator<Student> a = (Student a1, Student a2) -> {
        // return a1.age > a2.age ? 1 : -1;
        // };

        Collections.sort(list, (Student a, Student b) -> {
            return a.age > b.age ? 1 : -1;
        });
        System.out.println(list);
    }
}
