class Solution {
    public String removeTrailingZeros(String num) {
        int count=0;
        int len=num.length();
        for(int i=len-1;i>=0;i--){
            char c=num.charAt(i);
            if(c!='0'){
            break;
            }
            else{
                count++;
            }
            
        }
        return num.substring(0,len-count);
    }
}