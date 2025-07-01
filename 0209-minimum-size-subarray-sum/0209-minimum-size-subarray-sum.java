class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        boolean f=false;
        int len=nums.length;
        int start=0;
       
        int minlength=Integer.MAX_VALUE;
        for(int i=0;i<len;i++) {
            sum+=nums[i];
            while(sum>=target){
                f=true;
                minlength=Math.min(minlength,i-start+1);
                sum-=nums[start];
                start++;
            }
        }
     return f?minlength:0;
    }
}