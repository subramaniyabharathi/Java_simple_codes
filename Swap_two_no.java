import java.util.*;
class Swap_two_no{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int a=x.nextInt();
        int b=x.nextInt();
        int temp;
        System.out.println("Before swap : "+a + "\t" +b);
        temp=a;
        a=b;
        b=temp;
        System.out.print("After swap : "+a+ "\t" +b);


    }
}