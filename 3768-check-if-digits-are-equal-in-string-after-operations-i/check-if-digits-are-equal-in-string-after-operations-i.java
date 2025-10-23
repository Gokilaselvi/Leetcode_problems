class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String str="";
            for(int i=0;i<s.length()-1;i++){
                int sum=Integer.parseInt(s.substring(i,i+1))+Integer.parseInt(s.substring(i+1,i+2));
                sum%=10;
                str+=String.valueOf(sum);

            }
            s=str;
        }
        
        return s.charAt(0)==s.charAt(1);
    }
}