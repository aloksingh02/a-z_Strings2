import java.util.*;
import java.util.Scanner;
public class String_countingCompression {
    public static String compression1(String str){
        String s = str.substring(0)+"";
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr!=prev){
                s+=curr;
            }
        }
        return s;
    }
    public static String compression2(String str){
        String s = str.charAt(0) +"";
        int count = 1;
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    s += count;
                    count =1;
                }
                s += curr;
            }
        }
        if(count > 1){
            s += count;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("Compression 1 (Remove duplicates): " + compression1(str));
        System.out.println("Compression 2 (With counts): " + compression2(str));
    }
}
