class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int temp;
        for(int i=0;i<nums.length;i+=2){
            temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }return nums;
    }
}