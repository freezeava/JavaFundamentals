
import java.util.Scanner;
public class largestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nos a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println("A is larger than B");
        }else{
            System.out.println("B is larger than A");
        }
        
    }
    
}
