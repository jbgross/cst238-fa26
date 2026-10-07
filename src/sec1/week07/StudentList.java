package sec1.week07;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    public static void main(String[] args) {
        Student s1 = new Student("Jyrex", "01234", 20, 48);
        Student s2 = new Student("Madeleine", "01235", 20, 49);
        Student s3 = new Student("Erin", "01236", 20, 50);
        Student s4 = new Student("Andre", "01237", 20, 60);
        Student s5 = new Student("Edmond", "01238", 20, 30);
        Student s6 = new Student("Jessica", "01239", 20, 45);
        System.out.println(s2.compareTo(s5));

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(new Student("Chris", "345689", 20, 283));

        for(int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            System.out.println(s);
//            System.out.println(students.get(i));
        }

        System.out.println();
        ArrayList<String> names = new ArrayList<>();
        Collections.sort(names);

        System.out.println("Sorted: ");
        Collections.sort(students);
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }
}
