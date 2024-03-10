import java.util.Scanner;

public class SwapFun {

    public static void swapFun(int a,int b){
        int temp=0;
        System.out.println("Before swappig: a= "+a+" and b= "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swappig: a= "+a+" and b= "+b);
    }
  

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        swapFun(a,b);
        
    }
    
}
