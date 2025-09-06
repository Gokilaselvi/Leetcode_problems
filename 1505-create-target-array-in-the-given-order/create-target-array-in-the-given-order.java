class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer>list=new ArrayList<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            list.add(index[i],nums[i]);
        }
        int [] arr=new int[len];
        for(int i=0;i<len;i++){
          arr[i]=list.get(i);
        }
        return arr;
    }
}