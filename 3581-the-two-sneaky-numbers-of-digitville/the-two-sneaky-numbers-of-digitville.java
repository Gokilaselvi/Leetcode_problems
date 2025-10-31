class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int len=nums.length;
       int [] arr=new int[2];
       int a=0;
       for(int i=0;i<len;i++){
          
        for(int j=i+1;j<len;j++){
           if(nums[i]==nums[j]){
            arr[a]=nums[i];
           a++;
        }
        }
       } 
       Arrays.sort(arr);
       return arr;
    }
}