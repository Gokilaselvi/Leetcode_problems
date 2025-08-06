class Solution {
    public boolean isFascinating(int n) {
        String  check="";
        check+=String.valueOf((n));        
        check+=String.valueOf((n*2));
        check+=String.valueOf((n*3));
        int []farr=new int[10];
        //long num=Integer.parseInt(check);
        for(char c:check.toCharArray()){
            int rem=c-'0';
            farr[rem]++;
        }
        for(int i=1;i<10;i++){
            if(farr[i]!=1)return false;
        }
        
 return true;
    }
}