class Solution {
    public int rearrangeCharacters(String s, String target) {
       int [] farrs=new int [26];
       int [] farrtarget=new int [26];
       for(int i=0;i<s.length();i++){
        farrs[s.charAt(i)-'a']++;
       }for(int i=0;i<target.length();i++){
        farrtarget[target.charAt(i)-'a']++;
       }
        int count=10000;
        int val;
        for(int i=0;i<target.length();i++){
         val=target.charAt(i)-'a';
         count=Math.min(count,farrs[val]/farrtarget[val]);
        }
       return count;
    }
}