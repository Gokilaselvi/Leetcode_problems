class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
       char [] arr=s.toCharArray();
        int count=0;
        for(int i=1 ;i<arr.length;i++){
            if(arr[i]!=arr[i-1])count++;
        }return count;
    }
}