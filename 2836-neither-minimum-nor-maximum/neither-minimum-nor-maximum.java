class Solution {
    public int findNonMinOrMax(int[] nums) {
      int min=1000;
      for(int i:nums){
        min=Math.min(i,min);
      } int max=1;
      for(int i:nums){
        max=Math.max(i,max);
      } 
      for(int i:nums){
        if(i!=min && i!=max)return i;
      }  return -1;
    }
}