package com.lm.question.primary;

import java.util.ArrayList;

/**
 * 螺旋矩阵
 */
public class NC38 {
    /**
     * [[1,2,3],[4,5,6],[7,8,9]]
     * [1,2,3,6,9,8,7,4,5]
     * @param matrix
     * @return
     */
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0){
            return list;
        }
        int left = 0,right = matrix[0].length-1,top = 0,bottom = matrix.length-1;
        while (true){
            //从左往右
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            if (++top > bottom){
                break;
            }
            //从上到下
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            if (left > --right){
                break;
            }
            //从右往左
            for (int i = right; i >= left ; i--) {
                list.add(matrix[bottom][i]);
            }
            if (top > --bottom){
                break;
            }
            //从下往上
            for (int i = bottom; i >= top ; i--) {
                list.add(matrix[i][left]);
            }
            if (++left > right){
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list = new NC38().spiralOrder(matrix);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
