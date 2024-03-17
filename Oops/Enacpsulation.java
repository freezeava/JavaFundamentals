public class Enacpsulation {

    public static void main(String[] args) {

        Student s1=new Student();
        
        s1.setage(33);
        System.out.println(s1.getage());

        s1.setname("Aashish");
        System.out.println(s1.getname());

        Student s2=new Student("Kashish",23);
        System.out.println(s2.name+" "+s2.age);

    }
    
}

class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;

    }

    Student(){
        System.out.println("Student object is created");
    }

  //getters and setters
    void setage(int age){
        this.age=age;

    }

    int getage(){
        return age;
    }

    void setname(String name){
        this.name=name;
    }

    String getname(){
        return name;
    }
}
