import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        int max=0;
        //int len=nums.length;
        Set<Integer>set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }

       for(int i:nums){
        if(i>max)max=i;;
       }
       int len=set.size();
       if(len<3)return max;
       int pos=0;
       int ele=0;
       for(int j:set){
       ele=j;
       if(pos==len-3)break;
       pos++;
       }
       return ele;
    }
}