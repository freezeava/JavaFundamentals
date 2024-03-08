import java.util.Scanner;
public class switchcalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Enter the operator to perfrom operation:");
        char ope=sc.next().charAt(0);



        switch(ope){



        case '+':
        System.out.println("sum is: "+(a+b));
        break;
        case '-':
        System.out.println("Difference is: "+(a-b));
        break;
        case '*':
        System.out.println("product is: "+(a*b));
        break;
         case '/':
        System.out.println(" Quotient is: "+(a/b));
        break;
        case '%':
        System.out.println("remainder is: "+(a%b));
        break;
        default:
        System.out.println("Invalid operator");


        }
        
    }
    
}
