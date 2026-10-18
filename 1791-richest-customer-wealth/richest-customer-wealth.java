class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr=new int[accounts.length];
        int maxans=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int col =0;col<accounts[i].length;col++){
                 sum =sum+accounts[i][col];
            }
            // arr[i]=sum;
              maxans=Math.max(maxans,sum);
        }
       
        return maxans;
    }
}