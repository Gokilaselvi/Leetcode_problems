class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<Integer>arr2= new ArrayList<>();
        for(int i:nums1)arr2.add(i);
        for(int i=0;i<nums2.length;i++){
            if(arr2.contains(nums2[i]) && !arr.contains(nums2[i])){
                    arr.add(nums2[i]);
            }
        }
        int [] res=new int[arr.size()];
        int i=0;
        for(int in:arr){
            res[i]=in;
            i++;
        }
        return res;
    }
}