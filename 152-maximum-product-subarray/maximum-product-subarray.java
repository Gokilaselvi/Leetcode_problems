class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        int prod=0;
        int max=nums[0];
        for(int i=0;i<len;i++){
            prod=1;
            for(int j=i;j<len;j++){
                prod*=nums[j];
                max=Math.max(max,prod);
            }
        }
        return max;
    }
}