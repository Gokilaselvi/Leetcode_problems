class Solution {
    public int subarraySum(int[] nums) {
       int sum;
       int totalsum=0;
       int len=nums.length;
       int start;
       for(int i=0;i<len;i++){
        sum=0;
        start=Math.max(0,i-nums[i]);
            for(int j =start;j<=i;j++){
                sum+=nums[j];
            }
             totalsum+=sum;
        
       } return totalsum;
    }
}