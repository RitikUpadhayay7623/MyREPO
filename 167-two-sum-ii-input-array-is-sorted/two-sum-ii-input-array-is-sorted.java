class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //HERE LOOP IS SORTED SO WE USE A BETTER APPROACH HERE THAN TWO SUM I

        int i=0;

        for(int j=numbers.length-1;j>=0;j=j){     //Here its better to use while(i<j) becoz we already reduce
            if(numbers[i]+numbers[j]>target){     // j once in loop as j-- so ensuring j reduce only once per iter
             j--;                                 //we update j=j means no change
            }else if(numbers[i]+numbers[j]<target){
               i++;
            }else{
                 return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
}