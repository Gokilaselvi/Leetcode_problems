class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
      int frontsum=0;
      int lastsum=0;
      int len=nums.length;
      int ind=0;
      while(ind<len && ind<k)  {
        frontsum+=nums[ind];
        ind++;
      } 
       ind=len-1;
       int i=0;
      while(ind>=0 && i<k)  {
        lastsum+=nums[ind];
        ind--;
        i++;
      }
      System.out.println(frontsum+" "+lastsum);
      return Math.abs(frontsum-lastsum);
    }
}