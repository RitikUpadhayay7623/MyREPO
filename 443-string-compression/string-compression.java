class Solution {
    public int compress(char[] chars) {
        
         int index=0;
        for(int i=0;i<chars.length;i++){
            int count=0;
            char ch = chars[i];
            while(i<chars.length && ch==chars[i]){
                count++;
                i++;
            }
            if(count==1){ chars[index]=ch;
            index++;
           }
        else{
            chars[index]=ch;
            index++;
            String str=Integer.toString(count);
            for(int j=0;j<str.length();j++){
                chars[index]=str.charAt(j);
                index++;
            }
        }
            i--;
        }
       return index;
    }
}