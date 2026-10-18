class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[i]==nums[j] && Math.abs(i-j)<=k && i!=j){
    //             return true;
    //             }
    //         }                             BRUTE FORCE TLE
    //     }
    //    return false;
    // }

  


        HashSet<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the window exceeds size k, remove the oldest element
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            
            // If the element is already in the set, a duplicate exists within distance k
            if (!window.add(nums[i])) {
                return true;
            }
        }
        
        return false;

    }
}