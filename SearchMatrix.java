public class SearchMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1 } };
        System.out.println(searchMatrix(arr, 13));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                for (int j = 0; j < matrix[i - 1].length; j++) {
                    if (matrix[i - 1][j] == target)
                        return true;
                }
            }
        }
        return false;
    }
}
