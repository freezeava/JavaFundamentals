import java.util.Scanner;

public class Palindromic {

    public static void palindromic(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<i-i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();

        palindromic(n);



    }
    
}
