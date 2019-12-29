import java.util.*;
class Largest_Among_n_Digits{
   public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       int n;
       System.out.print("Enter the number of elements : ");
       n=x.nextInt();
        int[] a = new int[n]; 
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }
        int larg=a[0];
        for(int j=0;j<n;j++){
            if(a[j]>larg){
                larg=a[j];
            }
        }
        System.out.println("Largest value is : "+larg);


    }
}