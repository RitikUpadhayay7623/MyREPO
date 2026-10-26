class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        
        int[] concat=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
          if(nums1[i]>nums2[j]){
           concat[k++]=nums2[j];
            j++;
          }else{
            concat[k++]=nums1[i];
            i++;
          }
        }

       while(i<n){
        concat[k++]=nums1[i++];
       }
       while(j<m){
        concat[k++]=nums2[j++];
       }

       int n1=n+m;
       if(n1%2==1){
        return (double) concat[n1/2];
       }
       return (double) (concat[n1/2]+concat[n1/2-1])/2.0;
    }
}