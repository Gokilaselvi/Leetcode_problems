class Solution {
    public String[] findWords(String[] words) {
        String firstrow="qwertyuiop";
        String secondrow="asdfghjkl";
        String thirdrow= "zxcvbnm";
        boolean first,second,third;
        String sub,str ;
        ArrayList<String>list=new ArrayList<> ();
        for(String lower: words){
            first=false;
            second=false;
            third=false;
            str=lower.toLowerCase();
           
            for(int i=0;i<str.length();i++){
                sub=str.substring(i,i+1);
                if(firstrow.contains(sub))first=true;
                else if(secondrow.contains(sub))second=true; 
                else if(thirdrow.contains(sub))third=true;
                if((!first && second && third )||(first && !second && third )||
                (first && second && !third ))break;              

            }
            if((!first && !second && third )||(!first && second && !third )||
                (first && !second && !third ))list.add(lower);


        }
        int arrlength=list.size();
        String [] res=new String [arrlength];
        for(int i=0;i<arrlength;i++){
            res[i]=list.get(i);
        }
        return res;
        
    }
}