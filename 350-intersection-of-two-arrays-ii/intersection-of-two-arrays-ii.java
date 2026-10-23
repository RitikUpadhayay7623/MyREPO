class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> li=new ArrayList<>();
    boolean[] used =new boolean[nums2.length];
     for(int i=0;i<nums1.length;i++){

        for(int j=0;j<nums2.length;j++){
         if(nums1[i]==nums2[j] && !used[j]){
           li.add(nums1[i]);
           used[j]=true;
           break;
         }
         
        }
     }
     int[] arr=new int[li.size()];
     for(int i=0;i<li.size();i++){
        arr[i]=li.get(i);
     }
       
       return arr;
    }
}