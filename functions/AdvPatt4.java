import java.util.Scanner;

public class AdvPatt4 {

    public static void numPatt1(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();

        numPatt1(n);



    }
    
}
