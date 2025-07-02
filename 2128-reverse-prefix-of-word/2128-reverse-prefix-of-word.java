class Solution {
    public String reversePrefix(String word, char ch) {
        int len=word.length();
        int ind=-1;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<len;i++){
           if(ch==word.charAt(i)){
            ind=i;
            break;
           }
        }
        if(ind==-1)return word;
        for(int i=ind;i>=0;i--){
            s.append(word.charAt(i));
        }
        return s.append(word.substring(ind+1)).toString();
    }
}