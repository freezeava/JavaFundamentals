import java.util.Scanner;

public class Bino {


    public static int  factoFun(int n){

        int fact=1;

        for(int i=1;i<=n;i++){
            fact*=i;

        }
      return fact;
    }


    public static float bin(int n,int r){


      float nfacto=factoFun(n);
      float rfacto=factoFun(r);
      float nmrFacto=factoFun(n-r);

      float nCr=nfacto/(rfacto*nmrFacto);

      return nCr;
    }





    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n and r: ");
       int n=sc.nextInt();
       int r=sc.nextInt();

      


       

       System.out.println("Binomialcoefficient is: "+bin(n, r));









        
    }
    
}
