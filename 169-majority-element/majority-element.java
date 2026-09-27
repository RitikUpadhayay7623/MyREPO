class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans=nums[nums.length/2];
        return ans;
    
    }
}