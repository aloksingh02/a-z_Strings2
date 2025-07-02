
public class String_logic {
    static boolean canMakeAllSame(String str) {
        int zeros = 0, ones = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0')
                ++zeros;
            else
                ++ones;
        }
        return (zeros == 1 || ones == 1);
    }
    public static void main(String args[])
    {
        System.out.println(canMakeAllSame("101") ? "Yes" : "No");
    }
}
