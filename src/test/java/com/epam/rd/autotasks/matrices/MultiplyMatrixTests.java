package com.epam.rd.autotasks.matrices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyMatrixTests {

    @Test
    public void testSmth() {
        int[][] a = { {1, 2}, {7, -13} };
        int[][] b = { {1, 2}, {7, -13} };
        int[][] expected = multiply(a, b);
        int[][] actual = MultiplyMatrix.multiply(a, b);
        Assertions.assertArrayEquals(expected, actual);
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
}
