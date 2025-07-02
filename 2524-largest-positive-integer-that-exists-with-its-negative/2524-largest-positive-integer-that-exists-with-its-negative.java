class Solution {
    public int findMaxK(int[] nums1) {
     ArrayList<Integer>nums=new ArrayList<>();
     for(int i=0;i<nums1.length;i++){
        nums.add(nums1[i]);
     }
        Collections.sort(nums);
     int len=nums.size();
     for(int i=len-1;i>=0;i--){
        int n=nums.get(i);
        if(nums.contains(-n)){
       return n;}
     }
     //System.out.println(nums);
     return -1;
     }
}