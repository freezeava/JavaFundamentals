package LoopsConcept;
import java.util.Scanner;

public class reverseOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//10899
        int rev=0;
             //10899
        while(n>0){
             rev=n%10;
             System.out.print(rev);
             n=n/10;
             

        }

        

    }
    
}
