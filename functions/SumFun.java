import java.util.Scanner;

public class SumFun {

    public static int sumFun(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter nos a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(sumFun(a,b));

        
    }
    
}
