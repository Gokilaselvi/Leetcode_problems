class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();
       int len=nums.length;
        int [] farr=new int[len+1];
        for(int i:nums ){
               farr[i]++;
        }
        for(int i=0;i<len+1;i++){
            if(farr[i]==2)ans.add(i);
        }return ans;
    }
}