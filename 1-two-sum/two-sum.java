class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table it store nums element as key and index as value 
        // later we use them  to find complement in hashmap and get the index value
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; 
        
     
    //   int strt=0;
    //     int end = nums.length-1;                   ARRAY
    //     while(strt<end){                           NEED 
    //        int sum=nums[end]+nums[strt];          TO BE
    //         if(sum==target){                       SORTED
    //            return new int[]{strt,end};
    //         }else if(target>sum){
    //           strt++;
    //         }else{
    //             end--;
    //         }
    //     }
    //     return new int[]{-1,-1};
    }
}