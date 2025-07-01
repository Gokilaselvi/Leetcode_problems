class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        int len=word.length();
        char prev=word.charAt(0);
        for(int i=1;i<len;i++){
            char now=word.charAt(i);
            if(now==prev)count++;
            else{
                prev=now;
            }
        }
        return count;
    }
}