import java.util.Scanner;

public class Diamond2 {

    public static void diode(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

           for(int j=0; j<i-1;j++){
            System.out.print("* ");
           }
           System.out.println();
            

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();


    diode(n);


    }
    
}
