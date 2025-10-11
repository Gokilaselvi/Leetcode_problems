class Solution {
    public boolean isMonotonic(int[] nums) {
        int len=nums.length;
        boolean increasing=false;
        boolean decreasing =false;
        for(int i=0;i<len-1;i++){
            if(nums[i]>nums[i+1])increasing=true;
            if(nums[i]<nums[i+1])decreasing=true;
        }
        return (!increasing || !decreasing);

       
        
       
    }
}