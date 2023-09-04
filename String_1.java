//Java Program to Get a Character From the Given String
import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        sc.close();
        System.out.println(str.charAt(n));
    }
}
