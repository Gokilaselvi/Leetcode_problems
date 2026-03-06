class Solution {
    public int numSpecial(int[][] mat) {
       int rowlen=mat.length;
       int collen= mat[0].length;
       int specialpos=0;
       boolean flag;
       for(int i=0;i<rowlen;i++){
        for(int j=0;j<collen;j++){                          
                flag=true;
            if(mat[i][j]==1){
             for(int k=0 ;k<collen;k++){
                if(k!=j && mat[i][k]==1){
                    flag=false;
                    break;                
             }
            }
            if(flag){
               for(int k=0 ;k<rowlen;k++){
                if(k!=i && mat[k][j]==1){
                    flag=false;
                    break;                
               }
              } 
            }
            if(flag)specialpos++;
            }
        }
       }return specialpos;
    }
}