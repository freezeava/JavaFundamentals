import java.util.Scanner;

public class AdvPatt3 {

    public static void charPatt(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=sc.nextInt();

        charPatt(n);

        
    }
    
}
