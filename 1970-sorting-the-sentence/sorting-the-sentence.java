class Solution {
    public String sortSentence(String s) {
        String [] strarr=s.split(" ");
        int len=strarr.length;
        String [] arr=new String [len];
        for(String str:strarr){
            int size=str.length();
            int ind=str.charAt(size-1)-'0';
            ind--;
            arr[ind]=str.substring(0,size-1);
        }
        String res="";
     for(String str:arr){
        res=res+str+" ";
     }
     return res.trim();
    }
}