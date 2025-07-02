class Solution {
    public String reversePrefix(String word, char ch) {
        int len=word.length();
        int ind=0;
        String s="";
        //char[] arr=word.toCharArray();
        for(int i=0;i<len;i++){
           if(ch==word.charAt(i)){
            ind=i;
            break;
           }
        }
        if(ind==0)return word;
        for(int i=ind;i>=0;i--){
            s+=word.charAt(i);
        }
        return s+word.substring(ind+1);
    }
}