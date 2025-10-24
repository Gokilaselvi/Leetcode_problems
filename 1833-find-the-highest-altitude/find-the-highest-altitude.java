class Solution {
    public int largestAltitude(int[] gain) {
        int len=gain.length;
        int [] arr=new int[len+1];
    
        int max=0;
        int val=0;
        for(int i=0;i<len;i++){
            val+=gain[i];
            max=Math.max(max,val);

        }
        return max;

    }
}