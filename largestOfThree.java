import java.util.Scanner;
public class largestOfThree {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three nos a , b & c: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    if(a>=b && a>=c){
        System.out.println("A is largest");
    }else if(b>=c){
        System.out.println("B is largest");
    }else{
        System.out.println("C is Largest");
    }
}
}
