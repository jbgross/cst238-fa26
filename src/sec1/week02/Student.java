package sec1.week02;

public class Student {

    private String name;
    private int id;
    private char [] answers;
    private int answerCounter;

//    public Student() {
//
//    }

    public Student(String n, int i) {
        setName(n);
        id = i;
        answers = new char[3];
        answerCounter = 0;
    }

    public String getName() {
        return name;
    }


    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public void addAnswer(char answer) {
        if (answerCounter >= answers.length) {
            resizeAnswers();
//            System.out.println("Too many answers");
//            return;
        }

        answers[answerCounter++] = answer;
    }

    public void resizeAnswers() {
        int newLength = answers.length * 2;
        char [] newAnswers = new char[newLength];
        for (int i = 0; i < answers.length; i++) {
            newAnswers[i] = answers[i];
        }
        answers = newAnswers;
    }

    public String toString() {
//        return "Student Name: " + name + " (ID: " + id + ")";
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: ");
        sb.append(name);
        sb.append(" (ID: ");
        sb.append(id);
        sb.append(") ");
        for (int i = 0; i < answerCounter; i++) {
            sb.append(answers[i]).append(" ");
        }

        return sb.toString();
    }
}
