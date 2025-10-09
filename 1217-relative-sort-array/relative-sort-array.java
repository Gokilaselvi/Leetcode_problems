class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pos=0;
        for(int i:arr2){
            for(int j=pos;j<arr1.length;j++){
                if(arr1[j]==i){
                    int temp=arr1[pos];
                    arr1[pos]=arr1[j];
                    arr1[j]=temp;
                    pos++;
                }
            }
        }
        int sort=arr1.length-pos;
        int [] remaining=new int [sort];
        int ind=0;
        for(int i=pos;i<arr1.length;i++){
            remaining[ind++]=arr1[i];
        }
        Arrays.sort(remaining);
        ind=0;
        for(int i=pos;i<arr1.length;i++){
            arr1[pos++]=remaining[ind++];
        }

        return arr1;
    }
}