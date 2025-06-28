import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character>arr=new ArrayList<>();
        int start=0;
        int end=0;
        int max=0;
        while(end<s.length()){
            char c=s.charAt(end);
            if(!arr.contains(c)){
                arr.add(c);
                max=Math.max(max,arr.size());
                end++;
                
            }
            else{
                arr.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
        }
}