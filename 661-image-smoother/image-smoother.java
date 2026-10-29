class Solution {
    public int[][] imageSmoother(int[][] img) {
       
       int n=img.length;
       int m=img[0].length;

       int[][] ans=new int[n][m]; 
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int sum=0;
            int count=0;
            for(int ni=Math.max(0,i-1);ni<=Math.min(n-1,i+1);ni++){
                for(int nj=Math.max(0,j-1);nj<=Math.min(m-1,j+1);nj++){
                    sum+=img[ni][nj];
                    count++;
                }
            }
            ans[i][j]=sum/count;
        }
       }
       return ans;
    }
}