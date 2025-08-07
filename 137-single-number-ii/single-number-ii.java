class Solution {
    public int singleNumber(int[] farr) {
        Arrays.sort(farr);
        for(int j=0;j<farr.length-1;j+=3){
            if(farr[j]!=farr[j+1])return farr[j];
        }
        return farr[farr.length-1];
    }
}