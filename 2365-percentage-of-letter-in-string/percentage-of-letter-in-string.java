class Solution {
    public int percentageLetter(String s, char letter) {
        int freq=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==letter){
                freq++;
        }}
         int ans=((freq*100)/len);
         return ans;
    }
}