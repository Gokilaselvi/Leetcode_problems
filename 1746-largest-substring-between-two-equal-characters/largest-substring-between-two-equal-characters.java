class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len=s.length();
        int ans=-1;
        int indf=0;
        int indl=0;
        String sub;
        char c;
        for(int i=0;i<len;i++){
           c=s.charAt(i);
           indf=s.indexOf(c);
           indl=s.lastIndexOf(c);
           if(indl!=indf){
            sub=s.substring(indf+1,indl);
           ans=Math.max(ans,sub.length());
           }  
            
            }
        return ans;
    }
}