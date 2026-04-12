import java.util.*;

public class ReverseQueue {
    public static <T> void reverse(Queue<T> queue) {
        if (queue.isEmpty()) return;

        T temp = queue.remove();
        reverse(queue);
        queue.add(temp);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        reverse(q);
        System.out.println(q); // [30, 20, 10]
    }
}