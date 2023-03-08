public class MatrixDiagonalSum {
    public static int findMaxDiagonalSum(int [][]matrix) {
        int maxDiagonalSum = 0;

        // finding max sum in upper triangle
        for(int i = 0; i < matrix.length; i++) {
            int x = 0, y = i, diagonalSum = 0;

            for(int j = i; j < matrix.length; j++) {
                diagonalSum += matrix[x][y];
                x++;
                y++;
            }

            if(diagonalSum > maxDiagonalSum) {
                maxDiagonalSum = diagonalSum;
            }
        }

        // finding max sum in lower triangle
        for(int i = 1; i < matrix.length; i++) {
            int x = i, y = 0, diagonalSum = 0;

            for(int j = i; j < matrix.length; j++) {
                diagonalSum += matrix[x][y];
                x++;
                y++;
            }

            if(diagonalSum > maxDiagonalSum) {
                maxDiagonalSum = diagonalSum;
            }
        }

        // returning max diagonal sum
        return maxDiagonalSum;
    }
}