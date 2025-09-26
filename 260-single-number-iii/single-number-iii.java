class Solution {
    public int[] singleNumber(int[] nums) {
        int [] res=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ind=0;
        int val=0;
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            val=entry.getValue();
            if(val ==1 ){
                res[ind]=entry.getKey();
                ind++;
            }
            if(ind==2)break;
        }
        return res;
    }
}