class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>intersect=new ArrayList<>();
        int row=nums.length;
       
        int [] freq=new int[1001];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<nums[i].length;j++){
              
               int num=nums[i][j];
                freq[num]++;
            }
        }
        for(int i=0;i<1001;i++){
           
            if(freq[i]==row)intersect.add(i);
        }
        return intersect;
    }
}