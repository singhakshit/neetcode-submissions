// class Solution {
//     public void setZeroes(int[][] matrix) {
//        int m=matrix.length,n=matrix[0].length;
//        HashSet<Integer> row=new HashSet<>();
//        HashSet<Integer> col=new HashSet<>();
//        for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==0){
//                     row.add(i);
//                     col.add(j);
//                 }
//             }
//        }
//        for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(row.contains(i)){
//                     matrix[i][j]=0;
//                 }
//                 if(col.contains(j)){
//                     matrix[i][j]=0;
//                 }
//             }
//        }
//        return;
//     }
    
// }

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowHasZero = false, colHasZero = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                colHasZero = true;
                break;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                rowHasZero = true;
                break;
            }
        }

        for (int r = 1; r < matrix.length; r++) {
            for (int c = 1; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        for (int r = 1; r < matrix.length; r++) {
            for (int c = 1; c < matrix[0].length; c++) {
                if (matrix[r][0] == 0 || matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (rowHasZero) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][0] = 0;
            }
        }

        if (colHasZero) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;
            }
        }
    }
}