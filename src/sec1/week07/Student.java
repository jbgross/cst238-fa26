package sec1.week07;

public class Student implements Comparable<Student> {
    private String name;
    private String id;
    private int age;
    private int height;

    public Student() {

    }

    public Student(String name, String id, int age, int height) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return name + " id: " + id + " height: " + height;
    }

    @Override
    public int compareTo(Student s) {
        return s.name.compareTo(this.name);
//        return this.height - s.height;
    }
}
