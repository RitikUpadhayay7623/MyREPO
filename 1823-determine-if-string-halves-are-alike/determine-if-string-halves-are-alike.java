class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String vowel="aeiouAEIOU";
        int a=0;
        int b=0;

        for(int i=0;i<n/2;i++){
         if(vowel.indexOf(s.charAt(i))!=-1){ //Can do both ==(count non vowels) or != (count vowels)
              a++;                           // Can also use vowel.conatins(s.charAt(i)) return true or faslse
         }
        }
         for(int i=n/2;i<n;i++){
         if(vowel.indexOf(s.charAt(i))!=-1){
              b++;
         }
        }
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}