class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
                    int prod=1;
                    boolean zero=false;
                    boolean secondzero=false;
                    boolean num=false;

        for(int i=0;i<len;i++){
           if(nums[i]!=0){
            prod*=nums[i];
            num=true;
           }
           else if(!zero) zero=true;
           else secondzero=true;
        }
        if(!num || secondzero) return arr;
        for(int i=0;i<len;i++){
            if(!zero){
            arr[i]=prod/nums[i];
            }
            else if(nums[i]==0)arr[i]=prod;
        }
        return arr;
    }
}