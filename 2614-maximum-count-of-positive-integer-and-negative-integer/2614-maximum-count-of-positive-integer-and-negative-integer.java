import java.util.*;
class Solution {
    public int maximumCount(int[] arr) {
        int i=0;
        int zerocount=0;
        int negativevalue=0;
        int len=arr.length;
        while(i<len&&arr[i]<=0){
        if(arr[i]==0)zerocount++;
        else{
         negativevalue++;
        }
        i++;
        }
        int result=Math.max(negativevalue,len-zerocount-negativevalue);
        return result;
    }
}