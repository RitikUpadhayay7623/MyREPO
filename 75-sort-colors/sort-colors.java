class Solution {
    public void sortColors(int[] nums) {
    //    int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(nums[j]>nums[j+1]){    BUBBLE SORT
    //                 int temp=nums[j];
    //                 nums[j]=nums[j+1];
    //                 nums[j+1]=temp;

    //             }
    //         }
    //     }

     int red=0;
     int white=0;
     int blue=0;
     for(int val:nums){
      if(val==0){
        red++;
     }
     else if(val==1){
        white++;
     }else{
        blue++;
     }
     }
     int p=0;
     while(red!=0){
        nums[p]=0;
        p++;
        red--;
     }
     while(white!=0){
        nums[p]=1;
        p++;
        white--;;
     }
     while(blue!=0){
        nums[p]=2;
        p++;
        blue--;
     }
      
    }
}