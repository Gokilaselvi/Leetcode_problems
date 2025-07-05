class Solution {
    public String removeTrailingZeros(String num) {
        String res="";
        boolean f=false;
        for(int i=num.length()-1;i>=0;i--){
            char c=num.charAt(i);
            if(f||c!='0'){
            res=c+res;
            f=true;
            }
            
        }
        return res;
    }
}