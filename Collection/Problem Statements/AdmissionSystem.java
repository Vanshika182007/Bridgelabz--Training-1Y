import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student s) {
        return s.marks - this.marks;
    }

    public String toString() {
        return name + " " + marks;
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interview = new LinkedList<>();
        TreeSet<Student> merit = new TreeSet<>();

        applicants.add(new Student("A", 85));
        applicants.add(new Student("B", 90));

        // shortlist
        for (Student s : applicants) {
            if (s.marks > 80) shortlisted.add(s);
        }

        interview.addAll(shortlisted);

        while (!interview.isEmpty()) {
            merit.add(interview.poll());
        }

        System.out.println("Merit List: " + merit);
    }
}