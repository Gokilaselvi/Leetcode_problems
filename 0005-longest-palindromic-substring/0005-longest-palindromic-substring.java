class Solution {
    public String longestPalindrome(String s) {
        int len= s.length();
        if (s == null ||len == 0) {
            return "";
        }
        if(len==1)return s;
         String longpalin="";
         for(int i=0;i<len-1;i++){
            for(int j=i;j<len;j++){
                String sub=s.substring(i,j+1);
                if(reverse(sub)&&sub.length()>longpalin.length()){
                    longpalin=sub;
                }
            }
         }
         
        return longpalin;
    }  
    public boolean reverse(String sub){
            int l=0;
            int r=sub.length()-1;
            while(l<r){
                if(sub.charAt(l)!=sub.charAt(r))return false;
                l++;
                r--;
            }
            return true;
                
         }  
}