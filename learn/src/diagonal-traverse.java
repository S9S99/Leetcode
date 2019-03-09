class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        
        int[] result = new int[matrix.length * matrix[0].length];
        
        int index = 0;
        boolean upper = true;
        int row = 0;
        int column = 0;
        
        while (index < matrix.length * matrix[0].length) {
            result[index] = matrix[row][column];
            if (upper) {
                if (column == matrix[0].length - 1) {
                    row++;
                    upper = false;
                } else if (row == 0) {
                    column++;
                    upper = false;
                } else {
                    row--;
                    column++;
                }
            } else {
                if (row == matrix.length - 1) {
                    column++;
                    upper = true;
                } else if (column == 0) {
                    row++;
                    upper = true;
                } else {
                    row++;
                    column--;
                }
            }
            index++;
        }
        return result;
    }
}
