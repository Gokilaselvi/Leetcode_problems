class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int [] arr=new int [60];
        for(char c:stones.toCharArray()){
            int ind=c-'A';
            arr[ind]++;
        }
        int ans=0;
        for(int i=0;i<jewels.length();i++){
            int d=jewels.charAt(i)-'A';
            ans+=arr[d];
        }return ans;
    }
}