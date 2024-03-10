import java.util.Scanner;

public class AdvPatt1 {


    public static void hollowRect(int m,int n){

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 ||j==n ||i==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        hollowRect(m,n);
    }

    
    
}
