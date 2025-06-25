class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    List<Integer>list=new ArrayList<>();
    int len=nums.length;
    for(int i=0;i<len;i++){
        for(int j=0;j<len;j++){
            if(nums[j]==key && Math.abs(i-j)<=k){
                list.add(i);
                break;
            }
        }
    }
    return list;
    }
}