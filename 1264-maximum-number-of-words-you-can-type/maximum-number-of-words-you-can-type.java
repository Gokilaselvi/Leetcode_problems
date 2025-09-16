class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean bool;
        int count=0;
        String [] arr=text.split(" ");
        for(String str:arr){
            bool=true;
            for(int i=0;i<brokenLetters.length();i++){
               if(str.indexOf(brokenLetters.charAt(i))>-1){
                    bool=false;
                    break;
                }
            }if(bool)count++;
        }
        return count;
    }
}