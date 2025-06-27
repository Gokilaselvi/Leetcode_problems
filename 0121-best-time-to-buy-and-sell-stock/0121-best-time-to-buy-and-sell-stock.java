class Solution {
    public int maxProfit(int[] arr) {
                int len=arr.length;
                int max=0;
                int min=arr[0];
                for(int i=1;i<len;i++){
                    if(min>arr[i]){
                        min=arr[i];
                    }
                    else{
                        int profit=arr[i]-min;
                        max=Math.max(max,profit);
                    }
                }

        
        return max;
    }
}