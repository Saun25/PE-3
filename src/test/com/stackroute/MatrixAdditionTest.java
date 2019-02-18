package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;
    @Before
    public void setUp() throws Exception {
        matrixAddition = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        matrixAddition = null;
    }

    @Test
    public void addMatrixSuccess(){
        int[] firstMatrix={1,2,3,4,5,6};
        int[] secondMatrix={9,8,7,6,5,4};
        int[][] result={{10,10},{10,10},{10,10}};
        assertArrayEquals(result,matrixAddition.addMatrix(3,2,firstMatrix,secondMatrix));
        assertNotNull(matrixAddition.addMatrix(3,2,firstMatrix,secondMatrix));
    }

    @Test
    public void addMatrixFailure(){
        int[] firstMatrix={10,6,8,7,6,5};
        int[] secondMatrix={9,8,5,6,5,4};
        int[][] result={{19,17},{15,13},{11,9}};
        assertNotEquals(result,matrixAddition.addMatrix(3,2,firstMatrix,secondMatrix));
        assertNotNull(matrixAddition.addMatrix(3,2,firstMatrix,secondMatrix));
    }
}

