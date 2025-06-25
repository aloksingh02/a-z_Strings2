import java.util.Scanner;
public class String_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        String s2 = sc.nextLine();
//        System.out.println(s1);
//        System.out.println(s2);
//        String s1 = sc.nextLine();
//        System.out.println(s1);
//        System.out.println(s1.length());

//        char ch = s1.charAt(3);
//        System.out.println(ch);

//        for(int i=0; i<s1.length(); i++){
//            char ch = s1.charAt(i);
//            System.out.println(ch);
//        }

//        String str = "abcd";
//        System.out.println(str.substring(0,1));
//        System.out.println(str.substring(2));

//        String str1 = "sdklfjgh";
//        for(int i=0; i< str1.length(); i++){
//            for(int j=i+1; j<=str1.length(); j++){
//                System.out.println(str1.substring(i, j));
//            }
//        }


//        String s1 = "alok";
//        s1 += "sjdg";
//        s1 += " ";
//        s1 += 2;

//        String s2 = "singh";
//        String s3 = s1+" "+s2;
//        System.out.println(s1);

        String s2  = "abc def ghi jkl";
        String[] parts = s2.split(" ");
        for(int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
        }
    }
}
