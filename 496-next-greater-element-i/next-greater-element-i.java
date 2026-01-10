class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
       int [] ans=new int[len1]; 
       for(int i=0;i<len1;i++){
        boolean flag=false;
        int j;
        for( j=0;j<len2;j++){
            if(nums1[i]==nums2[j])break;
        }
        for(int k=j+1;k<len2;k++){
            if(nums1[i]<nums2[k]){
                ans[i]=nums2[k];
                flag=true;
                break;
            }
        }
        if(!flag)ans[i]=-1;
       }return ans;
    }
}