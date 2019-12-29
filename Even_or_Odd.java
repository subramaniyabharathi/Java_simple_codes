import java.util.*;
class Even_or_Odd
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n=x.nextInt();
        if(n%2==0){
            System.out.print("It is Even");
        }
        else {
            System.out.print("It is Odd");
        }


    }
}