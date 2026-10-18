class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
       
        int[] arr1=new int[n];
        int[] arr2=new int[n];
       int[] con=new int[arr1.length+arr2.length];

        for(int i=0;i<n;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[i];
        }
        int idx=0;
        
        for(int itm:arr1){
            con[idx]=itm;
            idx++;
        }
        for(int itm: arr2){
            con[idx]=itm;
            idx++;
        }
       

        return con;

        
    }
}