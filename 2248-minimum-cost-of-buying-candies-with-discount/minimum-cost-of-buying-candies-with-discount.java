class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int candiesCost=0;
        int len=cost.length;
        
        int val=1;
        for(int i=len-1;i>=0;i--){
            if(val%3!=0){
               
                candiesCost+=cost[i];
                val++;
            }
            else{
                val=1;
            }
        }return candiesCost;
    }
}