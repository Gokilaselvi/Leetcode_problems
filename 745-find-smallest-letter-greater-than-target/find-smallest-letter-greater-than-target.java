class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len=letters.length;
        if(target>=letters[len-1]) return letters[0];
        
        for(int i=0;i<len;i++){
            if(letters[i]>target)return letters[i];
        }
        return '0';
    }
}