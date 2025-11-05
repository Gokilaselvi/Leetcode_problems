class Solution {
    public int minCost(String colors, int[] neededTime) {
       
        int val=0;
       
        for(int i=0;i<colors.length()-1;i++){
            int j=i;
            int max=neededTime[j];
            int sum=neededTime[j];
            if(colors.charAt(i)==colors.charAt(i+1)){
            while( j+1<colors.length() && colors.charAt(j)==colors.charAt(j+1)){
             
                sum+=neededTime[j+1];
                max=Math.max(neededTime[j+1],max);
                j++;
                            
            }

            sum-=max;
            val+=sum;
            i=j;
            }

        }
        return val;
    }
}