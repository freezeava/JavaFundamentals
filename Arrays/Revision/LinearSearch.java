public class LinearSearch{


    public static int linearSearch(int nums[],int key){

         
        for(int i=0;i<nums.length;i++){

            if(nums[i]==key){
                return i;
            }
        }

        return -1;

    }


    public static void main(String[] args) {
        int nums[]={22,33,444,43,55,52,62,61,77,88,89,100};

        int key=89;

        int index=linearSearch(nums,key);

        if(index==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key: "+key+" found at index: "+ index);
        }



    }

}