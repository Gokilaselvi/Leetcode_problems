class Solution {
    public int findMin(int[] nums) {
        int min=1000000;
        for(int i:nums){
            if(min>i)min=i;
        }
        return min;
    }
}