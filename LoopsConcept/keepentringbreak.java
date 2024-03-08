package LoopsConcept;
import java.util.Scanner;

public class keepentringbreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        do{
            
            int n=sc.nextInt();
            if(n%10==0){
                break; //also try continue
            }
            System.out.println(n);

        }while(true);
    }
    
}
