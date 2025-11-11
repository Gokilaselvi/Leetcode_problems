class Solution {
    public boolean detectCapitalUse(String word) {
       if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) return true;
       int val=word.charAt(0)-'A';
       if( val>=0 && val<26 && word.substring(1).equals(word.substring(1).toLowerCase()))return true;
       return false;

    }
}