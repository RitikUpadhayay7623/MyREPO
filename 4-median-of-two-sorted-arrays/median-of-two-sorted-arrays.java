class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        
        int[] concat=new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
          if(nums1[i]>nums2[j]){  //two pointer approach for inserting smaller ele in concat array 
           concat[k++]=nums2[j];
            j++;           
          }else{
            concat[k++]=nums1[i];
            i++;
          }
        }

       while(i<n){
        concat[k++]=nums1[i++];   // here if any elements left in any of arrays inserted after concating 
       }                        
       while(j<m){
        concat[k++]=nums2[j++];
       }

       int n1=n+m;               
       if(n1%2==1){
        return (double) concat[n1/2];  //if Array length is odd if find central element easily
       }
       return (double) (concat[n1/2]+concat[n1/2-1])/2.0; //for even we find central and one less ele then /2 for median 
    }
}