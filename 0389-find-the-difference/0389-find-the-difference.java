class Solution {
    public char findTheDifference(String s, String t) {
      int [] farr1=new int[150];
      int l1=s.length();
      for(int i=0;i<l1;i++){
        char c=s.charAt(i);
        farr1[c]++;
      }
      int [] farr2=new int[150];
      int l2=t.length();
      for(int i=0;i<l2;i++){
        char d=t.charAt(i);
        farr2[d]++;
      }
    
      for(int i=0;i<150;i++){
        if(farr1[i]!=farr2[i]){
          return  (char)i;
            
      }
      }
      return 'p';
    }
}