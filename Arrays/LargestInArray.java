import java.util.*;

public class LargestInArray {


    public static void max(int nums[]){
          int minu=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            if(nums[i]>minu){
                minu=nums[i];
               
            }
            
        }

        System.out.println("largest number in array is : "+minu);

        
    }


    public static void main(String[] args) {
        int nums[]={33,6,77,88,11,22,44,55,66,77,99,-1};

        max(nums);
    }
    
}
