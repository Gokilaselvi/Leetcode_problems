class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int ind=1;
        String [] arr=sentence.split(" ");
        for(String s:arr){
           
            if(s.startsWith(searchWord))return ind;
            ind++;
        }
        return -1;
    }
}