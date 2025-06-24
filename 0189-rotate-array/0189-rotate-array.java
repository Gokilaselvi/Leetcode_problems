class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
         k=k%len;
         ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<len;i++){
         arr.add(nums[i]);
        }
        Collections.rotate(arr,k);
        for(int i=0;i<len;i++){
            int   o=arr.get(i);
         nums[i]=o;
        }
       
      
    }
}