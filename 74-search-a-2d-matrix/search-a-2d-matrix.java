class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        // for(int[] arr:matrix){
        //     for(int val:arr){
        //         if(val==target){    NESTED LOOP RESTRICTED
        //             return true;
        //         }
        //     }
        // }
        // return false;

            int left=0;
            int right=(m*n)-1; //we taking whole array length at once to avoid nested loop
        while(left<=right){
            int mid=left+(right-left)/2;

          int row=mid/n;  //this find row and col index for evry mid we find in this array
          int col=mid%n;

          if(matrix[row][col]==target){//simple binary serach for target
            return true;
          }else if(matrix[row][col]<target){
            left=mid+1;
          }else{
            right=mid-1;
          }
       
        }
         return false;
}
}