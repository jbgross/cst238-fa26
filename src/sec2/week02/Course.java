package sec2.week02;

public class Course {

    private String courseName;
    private String courseId;
    private Student [] roster;
    private int rosterCounter;

    public Course(String name, String id) {
        courseName = name;
        courseId = id;
        roster = new Student[5];
        rosterCounter = 0;
    }

    public void addStudent(Student s) {
        roster[rosterCounter] = s;
    }

    public String getName() {
        return courseName;
    }

    public String courseId() {
        return courseId;
    }
}
