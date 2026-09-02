package sec2.week02;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student("Anya", 12345);
        Student s4 = s1;
        s4.setName("Vanya");
//        s1.setName("Anya");
//        s1.setId(12345);
        System.out.println(s1);
        Student s2 = new Student("Donald Duck", 12346);
//        s2.setName("Donald Duck");
//        s2.setId(12346);
//        setId();
        System.out.println(s2);

        Student s3 =
                new Student("Wile E. Coyote", 12347);
        s3.addAnswer('A');
        s3.addAnswer('E');
        s3.addAnswer('D');
        s3.addAnswer('B');
//        s3.resize();

        System.out.println(s3);

        int x = 5;
        int y = x;
        x = 7;
        System.out.println(y);


        Course c1 =
                new Course("CST238", "Data Structures");
        Course c2 =
                new Course("ENGR130", "Statics");

//        c2.addStudent("Donald Duck");
        c2.addStudent(s2);

    }
}
