class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();
        String [] arr=title.split(" ");
        int l=arr.length;
        for(int i=0;i<l;i++){
            int len=arr[i].length();
            if(len>2){
                String res=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,len);
                arr[i]=res;
            }
        }
        String s="";
        for(String f:arr){
            s+=f+" ";
        }
        return s.trim();
    }
}