import java.util.Scanner;

public class ArrayCreation {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        

        String students[]={"aashish","aman","rohan","raman"};
        System.out.println(students[0]);
        students[0]="Sachin";
        System.out.println(students[0]);





        int marks[]=new int[50];


        for(int i=0;i<marks.length;i++){
             marks[i]=sc.nextInt();
             System.out.println(marks[i]);
        }
    }
    
}
