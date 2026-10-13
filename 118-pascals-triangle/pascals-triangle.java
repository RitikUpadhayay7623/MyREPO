class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> rows= new ArrayList<>();    // main List we ahve to return 
        List<Integer> Firstrow=new ArrayList<>();    
        Firstrow.add(1);
        List<Integer> Secondrow=new ArrayList<>();
        Secondrow.add(1);                                 //manually adding 1 and 2 row
        Secondrow.add(1);

        if(numRows==1){
            rows.add(Firstrow);                        // return only first row if numRows given 1 
            return rows;
        }
        if(numRows==2){
            rows.add(Firstrow);
            rows.add(Secondrow);                       //  return only secondrow row if numRows given 2
            return rows;
        }
        rows.add(Firstrow);
        rows.add(Secondrow);                      // if neither case numRows>2  given then add first two rows

        for(int n=3;n<=numRows;n++){
            List<Integer> row=new ArrayList<>();

            row.add(1);  //first element of row

             List<Integer> prev= rows.get(n-2);   //browse previous row for addition in loop below 
            
            for(int i=1;i<n-1;i++){                   //run from 1 index of row to one less than actual length
                row.add(prev.get(i-1)+prev.get(i));    // so we can add 1 both ends
            }

            row.add(1);  // last element of row
            rows.add(row);    //adding created row from loop after 1 and 2 row in main list 
        }
       
        return rows;
    }
}