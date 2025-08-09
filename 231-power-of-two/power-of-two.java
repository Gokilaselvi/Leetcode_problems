class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        else if(n==1)return true;
        int ans=1;
        for(int i=1;i<=30;i++){
            ans*=2;
         if(ans==n)return true;
        }
        return false;
    }
}