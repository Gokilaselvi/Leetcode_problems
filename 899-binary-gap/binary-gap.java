class Solution {
    public int binaryGap(int n) {
 String binaryString = Integer.toBinaryString(n);   
 int max=0;
 int firstInd=0;
 int secondInd=0;
 int i=0;
 int len=binaryString.length();
 for(i=0;i<len;i++){
    if(binaryString.charAt(i)=='1'){
        firstInd=i;
        break;
    }
 }  int j =i; 
 for( j=i+1;j<len;j++){
    if(binaryString.charAt(j)=='1'){
        secondInd=j;
        break;
    }
 }
 //System.out.println(i+" "+j);
 max=secondInd-firstInd;
   if(secondInd==0)return 0;
 for( int z=j+1;z<len;z++){
    if(binaryString.charAt(z)=='1'){
        firstInd=secondInd;
        secondInd=z;
        int ind=secondInd-firstInd;
        if(max< ind)max=ind;
    }
 }
 return max;
  }
}