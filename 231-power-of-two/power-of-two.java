class Solution {
    public boolean isPowerOfTwo(int n) {
        int sqrt=(int)Math.sqrt(n)+2;
        int pow=0;
        while(pow<=sqrt){
         if(n==Math.pow(2,pow))return true;
         pow++;
        }
        return false;
    }
}