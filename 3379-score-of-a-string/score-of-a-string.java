import java.util.*;
class Solution {
    public int scoreOfString(String s) {
        int score=0;
    char [] carr=s.toCharArray();
        for(int i=1;i<carr.length;i++){
            score+=Math.abs(carr[i]-carr[i-1]);
        }return score;
    }
}