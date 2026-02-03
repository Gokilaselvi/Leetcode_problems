class Solution {
    public boolean isTrionic(int[] nums) {
      int len=nums.length;
      int p=0;
      for(int i=0;i<len-1;i++){
        if(nums[i]<nums[i+1])p++;
        else{
            break;
        }
      }
            int q=p;

         for(int i=p;i<len-1;i++){
        if(nums[i]>nums[i+1])q++;
        else{
            break;
        }
      } 
      boolean trionic=true;
      for(int i=q;i<len-1;i++) {
        if(nums[i]>=nums[i+1]){
            trionic=false;
            break;
        }
      }
      System.out.println(p+" "+q);
      if(p==0 || p== q || q==len-1)return false;
      return trionic;
    }
}