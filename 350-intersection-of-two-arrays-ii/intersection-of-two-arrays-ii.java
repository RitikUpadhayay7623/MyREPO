class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

    Map<Integer,Integer> mp = new HashMap<>();

    //count freq of ele in nums1
    for(int val:nums1){
        mp.put(val,mp.getOrDefault(val,0)+1);  
         //.get() return null if ele not found but getorDefault gives 0 ans +1 increasing the freq by 1 for that ele
    }
    List<Integer> li=new ArrayList<>();
    
    //check ele in nums2
    for(int num:nums2){
     if(mp.getOrDefault(num,0)>0){
        li.add(num);
        mp.put(num,mp.getOrDefault(num,0)-1);  // dec freq for that ele by one after inserting in list
     }
    }

     int[] arr=new int[li.size()];
     for(int i=0;i<li.size();i++){
         arr[i]=li.get(i);
      }
       
        return arr;


    // List<Integer> li=new ArrayList<>();
    // boolean[] used =new boolean[nums2.length];
    //  for(int i=0;i<nums1.length;i++){

    //     for(int j=0;j<nums2.length;j++){
    //      if(nums1[i]==nums2[j] && !used[j]){  
    //          //used[j] make that j  index true in boolean array so next time another same elemnt found in fisrt array while second arrys have same single ele !used become false and skip that iter avoiding element dupli if second array contain only single ele.
    //        li.add(nums1[i]);
    //        used[j]=true;
    //        break;
    //      }
         
    //     }
    //  }
    //  int[] arr=new int[li.size()];
    //  for(int i=0;i<li.size();i++){
    //     arr[i]=li.get(i);
    //  }
       
    //    return arr;
    }
}