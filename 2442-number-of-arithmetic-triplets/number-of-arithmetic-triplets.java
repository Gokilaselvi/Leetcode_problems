class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }int count=0;
        for(int i:set){
            if(set.contains(i+diff)&& set.contains(i+diff+diff))count++;
        }return count;
    }
}