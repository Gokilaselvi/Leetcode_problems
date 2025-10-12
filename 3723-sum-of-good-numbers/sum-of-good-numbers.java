class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
       int goodsum=0;
       int len=nums.length;
       for(int i=0;i<len;i++){
         if(i-k>=0 && i+k<len){
               if(nums[i-k]<nums[i] && nums[i+k]<nums[i])goodsum+=nums[i];
         }
        else if(i-k>=0 && nums[i-k]<nums[i] )goodsum+=nums[i];
        else if(i+k<len && nums[i+k]<nums[i] )goodsum+=nums[i];
        //else goodsum+=nums[i];
       } 
      return goodsum;
    }
}