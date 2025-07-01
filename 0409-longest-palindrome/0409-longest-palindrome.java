class Solution {
    public int longestPalindrome(String s) {
        int len=s.length();
        int [] farr=new int[128];
        // StringBuilder str=new StringBuilder(s);
        // if(str.reverse().toString().equals(s))return len;

        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            farr[c]++;
        }
        int count=0;
        boolean f=false;
        boolean oddfreq=false;
        for(int i=0;i<128;i++)   {
           // System.out.print(farr[i]+" ");
           int freq=farr[i];
            if(freq %2==0 ){
                
                count+=farr[i];
            }
            else if(freq>1  ){
                count=count+freq-1;
                oddfreq=true;
            }
            else if(freq==1) f=true;
            
        }if(oddfreq|| f)return count+1;
       return count;
    }
}