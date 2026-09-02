package sec1.week02;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student("SpongeBob", 8);
//        s1.setName("SpongeBob");
//        s1.setId(8);
//        System.out.println(s1.getId());
        s1.addAnswer('A');
        s1.addAnswer('D');
        s1.addAnswer('Z');
        s1.addAnswer('B');
        System.out.println(s1);

        Course c1 = new Course("CST238", "Data Structures");
        Course c2 = new Course("CST237", "Architecture");
        Course c3 = new Course("MATH170", "Discrete Mathematics");

        c1.addStudent(s1);
        for (int i = 0; i < 10; i++) {
            c1.addStudent(s1);
        }

    }
}
