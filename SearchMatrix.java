public class SearchMatrix {
    /*
     * Write an efficient algorithm that searches for a value target in an m x n
     * integer matrix matrix. This matrix has the following properties:
     * 
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the
     * previous row.
     * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
     * Output: true
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] >= target) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        System.out.println(matrix[i][j]);
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
/*
 * for(int i = 0 , j = 0; i<matrix.length && j<matrix[i].length;)
 * {
 * if(matrix[i][matrix[i].length-1] >= target && matrix[i][j] <= target)
 * {
 * for(int k = 0; k<matrix[i].length; k++)
 * {
 * if(matrix[i][k] == target)
 * return true;
 * }
 * return false;
 * }
 * else if(matrix[i][matrix[i].length-1] < target)
 * {
 * i++;
 * }
 * else
 * return false;
 * }
 * return false;
 */
/*
 * int row = 0;
 * int col = matrix[0].length - 1;
 * while(row < matrix.length && col >= 0) {
 * int ele = matrix[row][col];
 * if(ele == target) {
 * return true;
 * }
 * if(ele > target) {
 * col--;
 * }
 * else {
 * row++;
 * }
 * }
 * return false;
 */