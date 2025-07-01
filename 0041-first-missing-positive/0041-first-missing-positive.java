class Solution {
    public int firstMissingPositive(int[] nums) {
       Set<Integer>list=new HashSet<>();
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(i>0 && !list.contains(i)){
                list.add(i);
                max=Math.max(max,i);

            }
        }
        int ans=0;
        for(int i=1;i<=max;i++){
           if(!list.contains(i)){
            ans=i;
            break;
           }
        }
        return ans==0?max+1:ans;
    }
}