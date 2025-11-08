class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len=nums.length;
        int [] odd= new int [len/2];
        int [] even=new int [len/2];
        int oddind=0;
        int evenind=0;
        for(int i:nums){
            if(i%2==0){
                even[evenind]=i;
                evenind++;
            }
            else{
                odd[oddind]=i;
                oddind++;
            }
        }
        for(int i=0;i<len;i++){
            if(i%2==0){
                nums[i]=even[i/2];
            }
            else{
                nums[i]=odd[i/2];
            }
        }
        return nums;
    }
}