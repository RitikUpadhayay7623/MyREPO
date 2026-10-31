class Solution {
    public int findLucky(int[] arr) {
        int result=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            int dig=arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count ==dig){
                result=Math.max(result,dig);
            }
        }
        if(result==Integer.MIN_VALUE){
            return -1;
        }else{
            return result;
        }
    }
}