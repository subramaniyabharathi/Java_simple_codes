//Java Program to Replace a Character at a Specific Index
import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char ch = sc.next().charAt(0);
        sc.close();
        char chr[]=str.toCharArray();
        chr[n]=ch;
        str=new String(chr);
        System.out.println(str);
    }
}
