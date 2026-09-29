class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int l=0;
        int h=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[h])>Math.abs(nums[l])){
                ans[i]=nums[h]*nums[h];
                h--;
            }else{
                ans[i]=nums[l]*nums[l];
                l++;
            }
        }
        return ans;
    }
}