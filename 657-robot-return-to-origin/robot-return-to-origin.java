class Solution {
    public boolean judgeCircle(String moves) {
        //int [] farr=new int [26];
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        char c;
        for(int i=0;i<moves.length();i++){
            c=moves.charAt(i);
            if(c=='U')u++;
            else if(c=='D')d++;
            else if(c=='L')l++;
            else r++;
        }
        return (u==d)&&(l==r);
    }
}