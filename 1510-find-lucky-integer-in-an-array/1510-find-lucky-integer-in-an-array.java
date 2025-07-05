class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=-1;
        for(int i:map.keySet()){
            int value=map.get(i);
            if(value==i)ans=i;
        }
        return ans;
    }
}