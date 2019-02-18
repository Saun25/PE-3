/*Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix*/

package com.stackroute;

public class MatrixAddition {

    /**
     * The method takes two 1-d matrices as input and adds them,and stores them in a 2-d matrix.
     * @param rows
     * @param cols
     * @param firstMatrix
     * @param secondMatrix
     * @return int[][]
     */
    public int[][] addMatrix(int rows,int cols,int[] firstMatrix,int[] secondMatrix){
        int[][] result=new int[rows][cols];
        int k=0;

        //To add the two matrices
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                result[i][j]=firstMatrix[k]+secondMatrix[k];
                k++;
            }
        }
        //Return the result
        return result;
    }
}
