class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        int j=0;
        for(int val:heights){
            arr[j]=val;
            j++;
        }
        int count=0;
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
          if(heights[i]!=arr[i]){
            count++;
          }
        }
        return count;
    }
}