//Java Program to Print even length words
import java.util.Scanner;

public class String_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String[] ch=str.split(" ");
        for(int i=0;i<ch.length;i++){
            if(ch[i].length()%2==0){
                System.out.println(ch[i]);
            }
        }
    }
}
