class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

       int n=position.length;
       double[][] cars=new double[n][2]; //making 2d array to store position and timetakne total 2 cols.
       
       for(int i=0;i<n;i++){
        cars[i][0]=position[i];                          //first ele of evry row conatain position
        cars[i][1]=(double)(target-position[i])/speed[i]; // sec ele of evry row contain timetakenn t=d/s
       }

       Arrays.sort(cars,(a,b)-> Double.compare(b[0],a[0])); 
       //here its sort 2d array where a nd b are complete rows in cars comparing position 
       // in reverse order b[0],a[0] sort them in desending order like 10->8->7 whole row is sorted contain 
       //timetaken as well.

       int count=0;
       double prevtime=0;
      // car having timetak same or greater than prev car timetk reach target together as fleet so count++
       for(double[] car:cars){
     if(car[1]>prevtime){ //car is array in cars and car[1] is 1 index element in that subarray which is timet
           count++;
           prevtime=car[1];
        }
       }
       return count;
    }
}