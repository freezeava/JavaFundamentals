public class LinearSearch {


    public static int linearSea(int marks[],int key){

        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){

                return i;
            }  
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[]={33,44,55,66,7,88,8,99,};
        int key=88;

        int result=linearSea(marks,key);

        if(result==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("key= "+key+" found at  index:"+result);

        }
      


        
    }
    
}
