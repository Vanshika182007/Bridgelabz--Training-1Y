import java.util.*;
import java.time.LocalDate;

public class PolicyManager {
    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Policy p1 = new Policy(1,"Aman",LocalDate.now().plusDays(10),"Health",5000);
        Policy p2 = new Policy(2,"Riya",LocalDate.now().plusDays(40),"Auto",3000);
        Policy p3 = new Policy(3,"Raj",LocalDate.now().plusDays(20),"Home",4000);
        Policy p4 = new Policy(1,"Duplicate",LocalDate.now().plusDays(5),"Health",6000);

        // Add
        hashSet.add(p1); hashSet.add(p2); hashSet.add(p3); hashSet.add(p4);
        linkedSet.addAll(hashSet);
        treeSet.addAll(hashSet);

        // Display all
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedSet);
        System.out.println("TreeSet (sorted): " + treeSet);

        // Expiring within 30 days
        System.out.println("\nExpiring Soon:");
        for (Policy p : hashSet) {
            if (p.expiryDate.isBefore(LocalDate.now().plusDays(30))) {
                System.out.println(p);
            }
        }

        // Filter by coverage type
        System.out.println("\nHealth Policies:");
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase("Health")) {
                System.out.println(p);
            }
        }
    }
}