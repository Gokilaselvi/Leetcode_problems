class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digitsum=0;
        for(int i:nums){
            sum+=i;
            while(i>0){
                digitsum+=i%10;
                i/=10;
            }
        }
        return sum-digitsum;
    }
}