package com.albion.matrices.matrix2d;


public class Matrix2DSearch {
    /**
     * http://www.programcreek.com/2013/01/leetcode-search-a-2d-matrix-java/
     * https://leetcode.com/problems/search-a-2d-matrix/
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int midX = mid / n;
            int midY = mid % n;

            if (matrix[midX][midY] == target)
                return true;

            if (matrix[midX][midY] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    /**
     * http://www.programcreek.com/2014/04/leetcode-search-a-2d-matrix-ii-java/
     */
    public boolean searchMatrixV2(int[][] matrix, int target) {
        int m = matrix.length-1; // rows
        int n = matrix[0].length-1; // columns

        int i = m;
        int j = 0;

        while(i >= 0 && j <= n){
            if(target < matrix[i][j]){
                i--;
            }else if(target > matrix[i][j]){
                j++;
            }else{
                return true;
            }
        }

        return false;
    }
}
