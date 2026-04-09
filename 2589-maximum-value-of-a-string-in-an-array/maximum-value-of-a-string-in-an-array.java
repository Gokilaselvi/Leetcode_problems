class Solution {
    public int maximumValue(String[] strs) {
         boolean containsAlpha;
         int max=0;
         int len,num;
        for(String str: strs){
            containsAlpha = str.matches(".*[a-zA-Z].*");
            if(containsAlpha){
                len=str.length();
                max=Math.max(len,max);
            }
            else{
                num=Integer.parseInt(str);  
                max=Math.max(num,max);
            }
            
        }
        return max;
    }
}