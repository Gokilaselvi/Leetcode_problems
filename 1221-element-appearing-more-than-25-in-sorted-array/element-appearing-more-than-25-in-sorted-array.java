class Solution {
    public int findSpecialInteger(int[] arr) {
      int count=1;
      int len=arr.length;
      if(len==1)return arr[0];
      for(int i=1;i<len;i++){
            if(arr[i]==arr[i-1])count++;
            else{
                count=1;
            }
            if(count>len/4){
                return arr[i];
            }
      } 
      return 0; 
    }
}