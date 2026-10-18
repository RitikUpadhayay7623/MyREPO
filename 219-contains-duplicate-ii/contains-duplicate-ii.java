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

    
   HashMap<Integer,Integer> map=new HashMap<>();
   for(int i=0;i<nums.length;i++){

      if(map.containsKey(nums[i])){
        int idx=map.get(nums[i]);
        if(Math.abs(i-idx)<=k){
            return true;
        }else{
            map.put(nums[i],i);
        }
      }else{
        map.put(nums[i],i);
      }
   }  
     return false;

        

    }
}