class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
      int len=nums.length-1;
      int ind=0;
      while(ind<k)  {
        ans+=nums[len-ind]-nums[ind];
        ind++;
      } 
       
      
      return ans;
    }
}