//Java Program to Sort a String
import java.util.Scanner;

public class String_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        for(int j=0;j<str.length();j++){
        for(int i=j;i<str.length()-1;i++)
        {
            if(ch[i]>ch[i+1])
            {
                char temp = ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
            }
        }}
        System.out.println(ch);
        sc.close();
    }
}
