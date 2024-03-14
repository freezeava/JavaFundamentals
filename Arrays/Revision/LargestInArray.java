public class LargestInArray {


    public static int largestInArray(int nums[]){
         int lar=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>lar){
                lar=nums[i];
            }
        }
        return lar;
    }



    public static void main(String[] args) {
        int nums[]={44,77,88,99,1,22,345,567,76,89,3,0};


        int largest=largestInArray(nums);
        System.out.println("Largest number is an array is: "+largest);




    }
    
}
