import java.util.Scanner;

public class Numpy {

    public static void numpy(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+"  ");

            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();


        numpy(n);
        
    }
    
}