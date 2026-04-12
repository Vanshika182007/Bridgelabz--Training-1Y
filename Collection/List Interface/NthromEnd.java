import java.util.*;

public class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) fast.next();
        }

        // Move both pointers
        T result = null;
        while (fast.hasNext()) {
            fast.next();
            result = slow.next();
        }

        // Last update
        if (result == null && slow.hasNext()) {
            result = slow.next();
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println(findNthFromEnd(list, 2)); // Output: D
    }
}