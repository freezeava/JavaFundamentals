package LoopsConcept;
import java.util.Scanner;

public class revseOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        //int n=sc.nextInt();//10899
        int rev=0;
        for(int n=sc.nextInt();n>0;n=n/10){
           int lastDigit=n%10;
           rev=rev*10+lastDigit;
        }
        System.out.println("reverse of a digit is: "+rev);


    }
    
}
