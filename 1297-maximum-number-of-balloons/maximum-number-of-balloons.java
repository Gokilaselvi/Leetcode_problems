class Solution {
    public int maxNumberOfBalloons(String text) {
        int len=text.length();
        int []farr=new int[26];
        char c;
        for(int i=0;i<len;i++){
            c=text.charAt(i);
            farr[c-'a']++;
        }
         int ans=Math.min(farr[13],farr[0]);
         ans=Math.min(ans,Math.min(farr[1],farr[11]));
       // if(ans==0)return ans;
        if(farr[11]==ans*2 && farr[14]==ans*2)return ans;
        ans=Math.min(ans,Math.min(farr[11]/2,farr[14]/2));
        return ans;
    }
}