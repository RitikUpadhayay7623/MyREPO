class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=1;j<nums.length;j++){       TIME
        //         if(nums[i]==nums[j] && i!=j){     LIMIT 
        //             count++;                      EXCEEDS
        //         }
        //     }
        // }
        // return count>0;
        Arrays.sort(nums);
        int index=0;
        for(int j=1;j<nums.length;j++){
            if(nums[index]==nums[j] ){
                return true;
            }
            index++;
        }
        return false;
    }
}