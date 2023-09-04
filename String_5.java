//Swapping Pairs of Characters in a String in Java
import java.util.Scanner;

public class String_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length()&& i+1<str.length();i=i+2){
            char temp = ch[i+1];
            ch[i+1]=ch[i];
            ch[i]=temp;
        }
        System.out.println(ch);
    }
}
