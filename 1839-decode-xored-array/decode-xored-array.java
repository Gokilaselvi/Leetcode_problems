class Solution {
    public int[] decode(int[] encoded, int first) {
        int len=encoded.length;
        int [] arr=new int [len+1];
        arr[0]=first;
        //arr[1]=first^encoded[0];
        int ind=1;
        for(int i=0;i<len;i++ ){
            arr[ind]=encoded[i]^arr[ind-1];
            ind++;
        }
        return arr;
    }
}