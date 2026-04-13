import java.util.*;

public class Replace0With1 {
    public static void replaceZeroWithOne(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.set(i, 1);
            }
        }
    }
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 3, 0));
        System.out.println("Original List: " + list);
        replaceZeroWithOne(list);
        System.out.println("Modified List: " + list);
    }
}