import java.util.*;
public class String_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("alok");
        System.out.println(sb);

        char ch = sb.charAt(1); //to get character
        System.out.println(ch);

        sb.setCharAt(2, 's'); //to set character
        System.out.println(sb);

        sb.insert(2,'h'); //to insert character
        System.out.println(sb);

        sb.deleteCharAt(2);// to delete character
        System.out.println(sb);

        sb.append('f');
        System.out.println(sb);
    }
}
