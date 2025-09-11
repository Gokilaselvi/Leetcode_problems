class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>list=new ArrayList<>();
        int div=0;
        char c;
        char d;
        int g=0;
        int k=0;
        boolean f=true;
        String str;
        for(int i=left;i<=right;i++){
                 div=i;
          if(i<10){
            list.add(i);
          }
           
          else{
            str=Integer.toString(i);
                           // System.out.print(str);

            f=true;
            for(int ind=0,j=str.length()-1;ind <=j;ind++,j--){
                c=str.charAt(ind);
                g=c-'0';
                d=str.charAt(j);
                k=d-'0';
                if((g==0  || k==0 )|| (i%(g)!=0 ||i%(k)!=0)){
                    f=false;
                     break;
                }

            }if(f)list.add(div);

            }
          
        }return list;
    }
}