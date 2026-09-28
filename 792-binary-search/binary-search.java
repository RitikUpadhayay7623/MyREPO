class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
       int ans= search(low,high,target,nums);  
            return ans;
    }
    static int search(int l,int h,int tar,int[] arr){
        while(l<=h){
          int mid=(h+(h-l))/2;
          if(arr[mid]==tar){
            return mid;
          }
          else if(tar >arr[mid]){
            l=mid+1;
          }
          else{
           h=mid-1; 
          }
        }
        return -1;

        }
}