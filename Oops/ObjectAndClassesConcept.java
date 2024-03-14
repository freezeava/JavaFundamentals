
public class ObjectAndClassesConcept{


    public static void main(String[] args){

      //creating pen object
        Pen p1=new Pen();

     
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.tip);
        System.out.println(p1.color);

      //Creating Student Object
         Students s1=new Students();
         s1.calPer(80,75,59);

         s1.name="Advard";
         p1.color="Green";

         System.out.println(s1.name);
         System.out.println(s1.percentage);
         System.out.println(p1.color);

    }

    
}
class Students{

    String name;
    int age;
    float percentage;


    void calPer(int phy,int chem,int maths){
        percentage=(phy+chem+maths)/3;

    }
}

//Pen class created
class Pen{
    //Prop. and Behaviour/function()
    String color;
    int tip;

    void setTip(int tipSize){
        tip=tipSize;
    }

    void setColor(String kalar){

        color=kalar;
    }

    

}



