import java.util.Scanner;

public class AdvPatt5 {

    public static void floydsTriangle(int n){
         int k=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    

    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n=sc.nextInt();

        floydsTriangle(n);


}
    
}
