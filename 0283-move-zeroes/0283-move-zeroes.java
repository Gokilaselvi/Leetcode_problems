class Solution {
    public void moveZeroes(int[] nums) {
              int len2=nums.length;
if(len2>1){
      ArrayList<Integer>arr=new ArrayList<>();
      for(int i:nums){
        if(i!=0)arr.add(i);
      }
      int ind=0;
      for(int i:arr){
     nums[ind]=i;
     ind++;
      }
      int len=arr.size();
      //len2-=len;
      for(int i=len;i<len2;i++){
        nums[i]=0;
      }}

    }
}