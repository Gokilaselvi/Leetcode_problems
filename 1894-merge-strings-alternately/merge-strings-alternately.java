class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int i=0;
        int j=0;
        StringBuilder  res= new StringBuilder();
        while(i!=len1 && j!=len2){
            res.append(word1.charAt(i));
            i++;
            res.append(word2.charAt(j));
            j++;
        }
        res.append(word1.substring(i,len1));
        res.append(word2.substring(j,len2));
        return res.toString();
    }
}