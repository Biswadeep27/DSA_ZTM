package SequenceAdv;

import java.util.Arrays;

public class MatrixExamples {
    public static int kthSmallest(int[][] matrix, int k){
        if (Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray().length < k){
            return -1;
        }
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sorted().toArray()[k-1];
    }

    public static void main(String args[]){
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 5;

        int ans = kthSmallest(matrix,k);
        System.out.println("kth smallest element in the matrix: " + (ans));
    }
}
