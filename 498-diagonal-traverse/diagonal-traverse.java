class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
      
    int m=mat.length;
    int n=mat[0].length;

    int row=0;
    int col=0;    //do a dry run or video if confused
    int idx=0;      //u can do it 

    int[] ans=new int [n*m];
    boolean up=true;

    while(row<m && col<n){
        //for transvers upward diagonal row-- and col++ 
        if(up){
            while(row>0 && col<n-1){
            ans[idx++]=mat[row][col];
            row--;                      //this loop run less than one digit from last diagonal ele 
            col++;
            }
            ans[idx++]=mat[row][col];   //here that last element is added
            if(col==n-1){               //at edge we cannot col++ further so choose row++ 
                row++;
            }else{
                col++;
            }
        }
    else if(!up){
      while(row<m-1&& col>0){
            ans[idx++]=mat[row][col];
            row++;
            col--;
            }
            ans[idx++]=mat[row][col];
            if(row==m-1){
                col++;
            }else{
                row++;
            }
       }
       up=!up;
    }
    return ans;
    }
}