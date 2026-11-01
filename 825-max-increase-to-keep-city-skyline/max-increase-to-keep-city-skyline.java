class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
     
     int n=grid.length;
    int[] rowMax=new int[n];
    int[] colMax=new int[n];

     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          rowMax[i]=Math.max(rowMax[i],grid[i][j]);//this array store max of evry row
          colMax[j]=Math.max(colMax[j],grid[i][j]);
     //this arry store max of evry col by running row-wise and updating value for each j=0,1,2,3... in colMax array in evry iteration means updating value of evry index 0,1,2,3 in colmax array for evry row
        }
     }

     //Now we have max arrys of both row and col we simply store min value btw max of that row and col the subtract the ele we transevering from that min and add to sum for evry ele we tranvsere.
     int sum=0;
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            int min=Math.min(rowMax[i],colMax[j]);
            sum+=min-grid[i][j];
        }
     }
     return sum;
    }
}