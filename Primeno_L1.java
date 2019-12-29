import java.util.*;
class Primeno_L1{
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter a number");
        n=x.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is a Prime no");
        }
        else{
            System.out.println("It is not a Prime no");
        }

    }
}