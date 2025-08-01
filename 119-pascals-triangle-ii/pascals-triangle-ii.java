class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>firstrow=new ArrayList<>();
        firstrow.add(1);
        list.add(firstrow);
        if(rowIndex==0)return firstrow;
        for(int i=1;i<=rowIndex;i++){
            List<Integer>current=new ArrayList<>();
            List<Integer>prev=list.get(i-1);
            current.add(1);
            for(int j=1;j<i;j++){
             current.add(prev.get(j)+prev.get(j-1));
            }
            current.add(1);
            list.add(current);
        }
        return list.get(rowIndex);
        
        
    }
}