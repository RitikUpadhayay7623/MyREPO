class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> rows= new ArrayList<>();
        List<Integer> Firstrow=new ArrayList<>();
        Firstrow.add(1);
        List<Integer> Secondrow=new ArrayList<>();
        Secondrow.add(1);
        Secondrow.add(1);

        if(numRows==1){
            rows.add(Firstrow);
            return rows;
        }
        if(numRows==2){
            rows.add(Firstrow);
            rows.add(Secondrow);
            return rows;
        }
        rows.add(Firstrow);
        rows.add(Secondrow);

        for(int n=3;n<=numRows;n++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
             List<Integer> prev= rows.get(n-2);
            for(int i=1;i<n-1;i++){
                row.add(prev.get(i-1)+prev.get(i));
            }

            row.add(1);
            rows.add(row);
        }
       
        return rows;
    }
}