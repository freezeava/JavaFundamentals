import java.util.Scanner;

public class FactoFun {
      

    public static int factFun(int n){
        int fact=1;

        //5!=5*4*3*2*1;

        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n to cal. Factorial of: ");
        int n=sc.nextInt();


        int facto=factFun(n);
        System.out.println("factorial of "+n+" is: "+facto);
        
    }
    
}
