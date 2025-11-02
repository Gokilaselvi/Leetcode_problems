class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        Set<Integer>set=new HashSet<>();
        for(int j=0;j<matrix.length;j++){
        for(int i:matrix[j]){
            set.add(i);
        }
        }
        return set.contains(target);
    }
}