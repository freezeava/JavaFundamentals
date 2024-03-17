public class SpecialConstructor{
    public static void main(String[] args) {

        
        int marks[]=new int[3];
         marks[0]=67;
         marks[1]=89;
         marks[2]=99;

         Student s1=new Student("Rogers",marks);


         for(int i=0;i<marks.length;i++){
            System.out.println(s1.marks[i]);
         }

          

        Student s2=new Student(26);
        Student s3=new Student("Aashish",26);

        System.out.println(s1.name);
        System.out.println(s2.age);
        System.out.println(s3.age+" "+s3.name);
    
        
        Student s4=new Student(s1);
        s4.age=77;
        System.out.println(s4.name+" "+s4.age);
        s1.marks[0]=72;
        for(int i=0;i<marks.length;i++){
            System.out.println(s4.marks[i]);
        }




        
    }
}

class Student{

    String name;
    int age;
    int marks[];

    Student(String name,int marks[]){
        
        this.name=name;
        this.marks=marks;
    }

    Student(int age){
        this.age=age;
    } 
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }
     //copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
        this.marks=s1.marks;

        

    }


}