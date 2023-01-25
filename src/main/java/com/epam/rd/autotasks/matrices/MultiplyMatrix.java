package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int R1=mat1.length;
        int C1=mat1[0].length;
        int R2=mat2.length;
        int C2=mat2[0].length;

        int[][] matrix1 = new int[R1][C2];

        int i, j, k;
        for (i = 0; i < R1; i++) {
            for (j = 0; j < C2; j++) {
                matrix1[i][j] = 0;
                for (k = 0; k < R2; k++)
                    matrix1[i][j] += mat1[i][k] * mat2[k][j];
               // System.out.print(rslt[i][j] + " ");
            }
           // System.out.println("");
        }

        return matrix1;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
