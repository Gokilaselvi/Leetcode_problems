class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
     // Arrays.sort(fruits);
     // Arrays.sort(baskets);
      boolean [] barr=new boolean[fruits.length];
      int count=0;
      for(int i=0;i<fruits.length;i++){
        boolean f=false;
        for(int j=0;j<baskets.length;j++){
        if(!barr[j]&& fruits[i]<=baskets[j]){
            barr[j]=true;
            f=true;
            break;
      }  }
      if(!f)count++;}
      return count;
    }
}