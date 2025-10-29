class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[] [] grid= new int [n][n];
        int val=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=val;
                val++;
            }
        }
        int row=0;
        int col=0;

        for(String str:commands){
            if(str.equals("UP"))row--;
            else if(str.equals("DOWN"))row++;
            else if(str.equals("RIGHT"))col++;
            else col--;
        }
        return grid[row][col];
    }
}