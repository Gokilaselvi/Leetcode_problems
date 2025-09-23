class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int [] res=new int [len];
        int max=0;
        for(int i=0;i<len-1;i++){
            if(i!=0 && res[i-1]>arr[i])res[i]=res[i-1];
            else{
            max=0;
            for(int j=i+1;j<len;j++){
                max=Math.max(max,arr[j]);

            }
            res[i]=max;
            }
        }
        res[len-1]=-1;
        return res;
    }
}