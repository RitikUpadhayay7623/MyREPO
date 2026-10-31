// class Solution {
//     public int findLucky(int[] arr) {
//         int result=Integer.MIN_VALUE;
        
//         for(int i=0;i<arr.length;i++){
//             int count=0;
//             int dig=arr[i];
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             if(count ==dig){
//                 result=Math.max(result,dig);
//             }
//         }
//         if(result==Integer.MIN_VALUE){
//             return -1;
//         }else{
//             return result;
//         }
//     }
// }
class Solution {
    public static int findLucky(int[] numbers) {  // 🎣 Let's start our lucky number hunt!
        int[] freq = new int[501];             // 📦 This is our frequency counter! Think of it like a shelf for each number from 0 to 500.

        for (int num : numbers) freq[num]++;   // 🚶‍♀️ We're strolling through our number line-up...
                                               //    ...and for each number, we bump up its counter on our frequency shelf.

        for (int i = 500; i > 0; i--)         // 🔎 Okay, time to check from biggest to smallest if anyone's lucky!
            if (i == freq[i]) return i;      // 🍀 Found a lucky one! This number (i) appears exactly i times!

        return -1;                              // 💔 Aww, no lucky numbers this time. Returning -1.
    }
}