class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i:nums){
            if(i>9)sum2+=i;
            else sum1+=i;
        }return sum1!= sum2;
    }
}