class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1){
            sum+=n/2;
           if(n%2==1)n++;
           //System.out.print(n+" ");
            n/=2;
        }
        return sum;
    }
}