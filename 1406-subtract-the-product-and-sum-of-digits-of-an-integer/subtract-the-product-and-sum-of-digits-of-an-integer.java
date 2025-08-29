class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        int r=0;
        while(n!=0){
            r=n%10;
            sum+=r;
            prod*=r;
            n/=10;
        }return prod-sum;
    }
}