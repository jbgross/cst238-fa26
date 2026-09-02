package sec1.week02;

public class Course {
    private String courseId;
    private String courseName;
    private Student [] roster;
    private int studentCounter = 0;
    private static final int DEFAULT_SIZE = 10;

    public Course(String id, String name) {
        courseId = id;
        courseName = name;
        roster = new Student[DEFAULT_SIZE];
    }

    public void addStudent(Student s) {
        roster[studentCounter++] = s;
    }

    public void resizeRoster() {

    }

    public String getName() {
        return courseName;
    }

    public String getId() {
        return courseId;
    }
}
