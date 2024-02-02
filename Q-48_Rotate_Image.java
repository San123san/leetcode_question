class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            int index=matrix.length-i;
            int[] rotate=matrix[i];
            matrix[i]=matrix[index-1];
            matrix[index-1]=rotate;
        }
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                int rotate=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=rotate;
            }
        }
    }
}