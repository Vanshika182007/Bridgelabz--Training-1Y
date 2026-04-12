import java.util.*;

public class ReverseList {
    public static <T> void reverse(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(arrList);
        System.out.println("ArrayList: " + arrList);

        List<Integer> linkList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverse(linkList);
        System.out.println("LinkedList: " + linkList);
    }
}