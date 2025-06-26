class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int ind=0;
        int [] arr={-1,-1};
        for(int i=0;i<len ;i++){
            if(nums[i]==target){
                arr[ind]=i;
               if (ind==0) ind++;
            }
             
             
        } 
        if(arr[0]>-1  && arr[1] ==-1 ) {
            arr[1]=arr[0];
            return arr;
        }
        else{
            return arr;
        }
    }
}