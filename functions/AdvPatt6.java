import java.util.Scanner;

public class AdvPatt6 {

    public static void zeroOneTriPatt(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=sc.nextInt();
        zeroOneTriPatt(n);
    
    }
    
}
