class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        
        // List<Integer> result = new int[matrix.length * matrix[0].length];
        List<Integer> result = new ArrayList<>();
        
        int index = 0;
        String direction = "right";
        int upLimit = 0;
        int downLimit = matrix.length - 1;
        int leftLimit = 0;
        int rightLimit = matrix[0].length - 1;
        int row = 0;
        int column = 0;
        
        while (index < matrix.length * matrix[0].length) {
            result.add(matrix[row][column]);
            
            switch (direction) {
                case "right":
                    if (column == rightLimit) {
                        row++;
                        upLimit = row;
                        direction = "down";
                    } else {
                        column++;                        
                    }
                    break;
                case "left":
                    if (column == leftLimit) {
                        row--;
                        downLimit = row;
                        direction = "up";
                    } else {
                        column--;                        
                    }
                    break;
                case "down":
                    if (row == downLimit) {
                        column--;
                        rightLimit = column;
                        direction = "left";
                    } else {
                        row++;                        
                    }
                    break;
                case "up":
                    if (row == upLimit) {
                        column++;
                        leftLimit = column;
                        direction = "right";
                    } else {
                        row--;                        
                    }
                    break;
            }
            index++;
        }
        return result;
    }
}
