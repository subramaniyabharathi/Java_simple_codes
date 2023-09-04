//Java Program to Reverse a String
import java.util.Scanner;

public class String_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String str1="";
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            str1 += str.charAt(i);
        }
        System.out.println(str1);
    }
}
