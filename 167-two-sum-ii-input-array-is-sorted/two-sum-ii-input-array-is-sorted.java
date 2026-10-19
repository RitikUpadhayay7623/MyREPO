class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }

        for(int i=0;i<numbers.length;i++){
            int comp=target-numbers[i];
            if(map.containsKey(comp) && map.get(comp)!=i){
                return new int[]{i+1,map.get(comp)+1};
            }
        }
        return new int[]{-1,-1};
    }
}