public class ObjectAndClassesPart2 {


    public static void main(String[] args) {

        Cat c1=new Cat();
        c1.name="Daisy";
        c1.walk();
        c1.colorSet("pink",4);
        c1.eat();
        c1.description();

        c1.eyes=2;
        c1.legs=4;
        c1.description();
        
    }


    
}



class Cat{

    String color;
    int legs,eyes;
    String name;
    int fishes;

    public void walk(){
        System.out.println(" cat is Walking");


    }

    public void colorSet(String setColor,int fiishes){
        color=setColor;
        fishes=fiishes;
        System.out.println(color +" "+ fishes);
    }


   public void eat(){
    System.out.println("My Cat has Eaten "+fishes +" pieces of Fish");
   }


   public void description(){
    System.out.println("My cat has "+legs+" legs and "+eyes+" eyes");
   }

  


}
