class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int strow=0;  int stcol=0;
        int endrow=m-1; int endcol=n-1;
         List<Integer> ans=new ArrayList<>();

        while(strow<=endrow && endcol>=stcol){  // <= in case if matrix is odd ex 3*3
            //right ->
            for(int j=stcol;j<=endcol;j++){
                 ans.add(matrix[strow][j]);
            }
            //bottom \/
            for(int i=strow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }
            //left <-
            for(int j=endcol-1;j>=stcol;j--){
                if(strow == endrow){
                    break; // in case of odd matrix no duplication of same row
                }
                ans.add(matrix[endrow][j]);
            }
            //top /\
            for(int i=endrow-1;i>=strow+1;i--){
                if(endcol==stcol){
                    break; // no col duplication in case of odd matrix
                }
               ans.add(matrix[i][stcol]);
            }

            strow++;  endrow--;
            stcol++;  endcol--;
        }
        return ans;
   }
}