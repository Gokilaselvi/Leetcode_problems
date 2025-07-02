import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        int len= s.length();
        if (s == null ||len == 0) {
            return "";
        }
        int start=0;int end=0;
        for(int i=0;i<len-1;i++){
            int len1=check(s,i,i);
            int len2=check(s,i,i+1);
            int maxlen=Math.max(len1,len2);
            if(maxlen>end-start){
                start=i-(maxlen-1)/2;
                end=i+maxlen/2;
            }
        } 
        return s.substring(start,end+1)    ;  
         }  
         public int check(String s,int left,int right){
            while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right) ){
                left--;
                right++;
            }
            return right-left-1;
         }
}