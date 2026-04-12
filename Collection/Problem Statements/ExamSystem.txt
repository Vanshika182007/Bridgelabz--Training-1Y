import java.util.*;

class Question {
    String text;
    Question(String t){ text = t; }
}

class Student {
    String id;
    Student(String id){ this.id = id; }
}

public class ExamSystem {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        Set<String> studentIds = new HashSet<>();
        Queue<Student> queue = new LinkedList<>();
        Stack<Question> nav = new Stack<>();

        // Add questions
        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        Collections.shuffle(questions);

        // Students
        studentIds.add("S1");
        studentIds.add("S2");

        queue.add(new Student("S1"));

        // Navigation
        nav.push(questions.get(0));
        nav.push(questions.get(1));
        System.out.println("Back: " + nav.pop().text);
    }
}