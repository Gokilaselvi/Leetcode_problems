class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            Arrays.sort(nums1);
            return ;
        }
        else{
            int pos=0;
            int y=nums1.length;
            for(int i=m;i<y;i++){
                nums1[i]=nums2[pos];
                pos++;
            }
        }
        Arrays.sort(nums1);
        return ;

    }
}