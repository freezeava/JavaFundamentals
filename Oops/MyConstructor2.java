public class MyConstructor2 {


    


    public static void main(String[] args) {

        Vehicle Audi =new Vehicle(5);

        System.out.println("no of wheels: "+Audi.wheels);
        

    }
    
}


class Vehicle{

        int wheels;

        Vehicle(int noOfwheels){

            wheels=noOfwheels;

        }

        

    }
