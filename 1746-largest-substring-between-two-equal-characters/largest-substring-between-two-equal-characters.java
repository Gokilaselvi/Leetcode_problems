class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len=s.length();
        int ans=-1;String str;
        for(int i=0;i<len;i++){
            for(int j= len-1;j>i;j--){
            if(s.charAt(i)==s.charAt(j)){
                str=s.substring(i+1,j);
                ans=Math.max(ans,str.length());
                break;
            }
            }
        }return ans;
    }
}