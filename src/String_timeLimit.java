import java.util.*;
public class String_timeLimit {
    public static void main(String[] args) {
        int n = 10000000;
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
