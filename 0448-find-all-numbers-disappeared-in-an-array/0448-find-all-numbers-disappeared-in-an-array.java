class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer>set=new HashSet<>();
         int len=nums.length;
         int min=1;
        for(int i=0;i<len;i++){
            set.add(nums[i]);
         
        }
       ArrayList<Integer>list=new ArrayList<>();
       int size=set.size();
        while(size+list.size()!=len){
            if(!set.contains(min))list.add(min);
            min++;
        }
        
        
        return list;
    }
}