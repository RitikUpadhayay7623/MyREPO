class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int n2:nums2){           //Create a set of nums2 array so duplicate removed
            set.add(n2);                      // from it
        }
        ArrayList<Integer> list= new ArrayList<>();   
          // we dont know the size of common elements to store in array


        for(int n1: nums1){     // loop through the nums1 to check if set of nums2      contains any nums1 element if yes then add it to list
            if(set.contains(n1)){
                list.add(n1);        
                set.remove(n1); //remove n1 if found in nums1 so cant duplicate in list 
            }
        }
        int[] res =new int [list.size()];
        for(int i=0;i<list.size();i++){       //list->array conversion 
            res[i]=list.get(i);
        }
        return res;
    }
}