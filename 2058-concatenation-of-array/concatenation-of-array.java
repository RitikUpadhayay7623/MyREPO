class Solution {
    public int[] getConcatenation(int[] nums) {
    //     int n=nums.length;
       
    //     int[] arr1=new int[n];
    //     int[] arr2=new int[n];
    //    int[] con=new int[arr1.length+arr2.length];

    //     for(int i=0;i<n;i++){
    //         arr1[i]=nums[i];
    //         arr2[i]=nums[i];
    //     }
    //     int idx=0;
        
    //     for(int itm:arr1){
    //         con[idx]=itm;
    //         idx++;
    //     }
    //     for(int itm: arr2){
    //         con[idx]=itm;
    //         idx++;
    //     }
    //     return con;

         int ans[] = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;

        // i = 0 → 0 % 3 = 0 → nums[0] = 1  
        // i = 1 → 1 % 3 = 1 → nums[1] = 2  
        // i = 2 → 2 % 3 = 2 → nums[2] = 3  
        // i = 3 → 3 % 3 = 0 → nums[0] = 1  
        // i = 4 → 4 % 3 = 1 → nums[1] = 2  
        // i = 5 → 5 % 3 = 2 → nums[2] = 3  
        
    }
}