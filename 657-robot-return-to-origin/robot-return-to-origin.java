class Solution {
    public boolean judgeCircle(String moves) {
        int [] farr=new int [26];
        
      //  char c;
        for(char c:moves.toCharArray()){
            //c=moves.charAt(i);
            farr[c-'A']++;
        }
        int u=farr[20];
        int d=farr[3];
        int l=farr[11];
        int r=farr[17];
        return (u==d)&&(l==r);
    }
}