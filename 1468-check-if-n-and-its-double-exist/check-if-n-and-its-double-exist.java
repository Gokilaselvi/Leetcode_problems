class Solution {
    public boolean checkIfExist(int[] arr) {
        // Set<Integer>set=new HashSet<>();
        // for(int i:arr){
        //     set.add(i);
        // }
        // for(int i:set){
        //     if(set.contains(i*2) )return true;
        // }return false;
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr[i]==arr[j]*2 && i!=j)return true;
            }
        }return false;
    }
}