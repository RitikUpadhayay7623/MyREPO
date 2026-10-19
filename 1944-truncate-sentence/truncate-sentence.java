class Solution {
    public String truncateSentence(String s, int k) {
        // String[] str=s.split(" ");
        // StringBuilder sb=new StringBuilder();
        // for(int i=0;i<k;i++){
        //     sb.append(str[i]+" ");
        // }                                           BRUTE FORCE
        // return sb.toString().trim();

         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                 k--;                    //count spaces until k=0 which means if reach last word we have to print
             if(k==0){
                 return s.substring(0,i);
              }
            }
         }
         return s;
    }
}