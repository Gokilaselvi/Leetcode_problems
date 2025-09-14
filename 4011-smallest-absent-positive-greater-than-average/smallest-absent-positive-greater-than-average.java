class Solution {
    public int smallestAbsent(int[] nums) {
       int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int avg=sum/nums.length;
        int missing=avg+1;
        if(missing<1)missing=1;
        Set<Integer>set=new HashSet<>();
        for(int i:nums) {
         if(i>avg)set.add(i);   
        }
        for(int k:set){
            if(!set.contains(missing)){
                return missing;
            }
            missing++;
        }
        return missing;
    }
}