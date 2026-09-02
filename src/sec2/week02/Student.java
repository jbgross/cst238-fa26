package sec2.week02;

public class Student {
    private String name;
    private int id;
    private char [] answers;
    private int answerCounter;

//    public Student() {
//        System.out.println("no param constructor");
//    }

    public Student(String n, int i) {
//        System.out.println("two param constructor");
        setName(n);
        id = i;
        answers = new char[3];
        answerCounter = 0;
    }

    private void resizeAnswers() {
       char [] newAnswers = new char[answers.length * 2];
//       newAnswers = answers;
        for (int i = 0; i < answerCounter; i++) {
            newAnswers[i] = answers[i];
        }
        answers = newAnswers;
    }

    public void addAnswer(char answer) {
         if (answerCounter >= answers.length) {
             resizeAnswers();
//             System.out.println("can't add more answers");
//             return;
         }
        answers[answerCounter++] = answer;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name: ");
        sb.append(name);
        sb.append(" (ID: ");
        sb.append(getId());
        sb.append(") Answers: ");
        for (int i = 0; i < answerCounter; i++) {
            sb.append(answers[i]).append(" ");
        }
        return sb.toString();
//        return "Student Name: " + name
//                + " (ID: " + id + ")"
//                + " Answers: " + answers[0];
    }


}
