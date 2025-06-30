import java.util.ArrayList;

public class String_arraylistRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding numbers
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Remove even numbers
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        System.out.println(list);  // Output: [1, 3, 5, 7, 9]
    }
}
