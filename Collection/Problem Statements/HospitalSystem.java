import java.util.*;

class Patient {
    String name;

    Patient(String name){ this.name=name; }

    public String toString(){ return name; }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> queue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p1 = new Patient("A");
        admitted.add(p1);
        queue.add(p1);

        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            history.add(p);
            discharged.push(p);
        }

        System.out.println("Re-admit: " + discharged.pop());
    }
}