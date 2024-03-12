public class PassingArrayAsArgument {


    public static void updateArray(int marks[]){

        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }



    }



    public static void main(String[] args) {

        int marks[]={22,44,55};


        updateArray(marks);


        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        
    }
    
}
