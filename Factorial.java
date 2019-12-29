import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n,result=1;
        System.out.print("Enter a number : ");
        n=x.nextInt();
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        System.out.println("Factorial value is : "+ result);

    }
}