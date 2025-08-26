import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String r="";
        for(int i=0;i<s.length();i++){
            char j=s.charAt(i);
            if('a'<=j && 'z'>=j || '0'<=j && '9'>=j){
                r=r+j;
            }
        }
        System.out.println(r);
        boolean flag=true;
        for(int i=0,j=r.length()-1;i<j;i++,j--){
            char f=r.charAt(i);
            char g=r.charAt(j);
            if(f!=g){
                flag=false;
                break;

            }
        }
       
        //if(r.equals(" "));
        return flag;

        
    }
    
}