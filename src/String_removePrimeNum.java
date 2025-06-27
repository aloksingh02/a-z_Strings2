import java.io.*;
import java.util.*;

public class String_removePrimeNum {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void solution(ArrayList<Integer> al){
        for(int i = al.size() - 1; i >= 0; i--){
            int val = al.get(i);
            if(isPrime(val)){
                al.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(sc.nextInt());
        }
        solution(al);
        for(int val : al){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
