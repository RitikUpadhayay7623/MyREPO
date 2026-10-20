class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        List<String> li=new ArrayList<>();

        for(String word:words){
            int[] row=new int[3];
            for(char ch:word.toLowerCase().toCharArray()){ 
                // we take row  keys in lower and charArray becoz advance for loop works on array only.
                if(row1.indexOf(ch)!=-1){
                    row[0]=1;
                }else if(row2.indexOf(ch)!=-1){
                    row[1]=1;
                }else{
                    row[2]=1;
                }
            }
            //checking if row sum is equals to 1 means all char belong to same row
            int sum=row[0]+row[1]+row[2];
            if(sum==1){
                li.add(word);
            }
        }
        //List-->String arr
        String[] arr=new String[li.size()];  
        int i=0;
        for(String word:li){
            arr[i]=word;
            i++;
        }
        return arr;
    }
}