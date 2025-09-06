class Solution {
    public int[] decode(int[] encoded, int first) {
        int len=encoded.length;
        int [] arr=new int [len+1];
        arr[0]=first;
        //int ind=1;
        for(int i=0;i<len;i++ ){
            arr[i+1]=encoded[i]^arr[i];
           
        }
        return arr;
    }
}