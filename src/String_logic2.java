import java.util.*;
public class String_logic2 {
    public static void permute(String str, String ans) {
            if (str.length() == 0) {
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String left = str.substring(0, i);
                String right = str.substring(i + 1);
                String rest = left + right;

                permute(rest, ans + ch);
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string to find its permutations:");
            String input = sc.nextLine();

            System.out.println("All permutations are:");
            permute(input, "");
        }
    }


