import java.util.Scanner;
public class Fun1{


     public static void helloWorld(int n){
        for(int i=1;i<=n;i++){
        System.out.println("Hello World!");
        }
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n=sc.nextInt();


        helloWorld(n);

        
    }
}