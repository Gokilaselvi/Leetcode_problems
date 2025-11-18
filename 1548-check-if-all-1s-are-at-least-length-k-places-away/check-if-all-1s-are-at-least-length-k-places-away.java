class Solution {
    public boolean kLengthApart(int[] nums, int k) {
       ArrayList<Integer>list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1)list.add(i);
       }
      
       for(int i=0;i<list.size()-1;i++){
        if(Math.abs(list.get(i)-list.get(i+1))<=k){
           return false;
        }
       }
       
       return true;

    }
}