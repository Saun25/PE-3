package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;
    @Before
    public void setUp() throws Exception {
        chessBoard=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        chessBoard=null;
    }

    @Test
    public void colouredBoxes() {


        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String actualValue[][]=chessBoard.ColouredBoxes();
        assertArrayEquals(expected,actualValue);
        assertNotNull(chessBoard);

    }


    @Test
    public void colouredBoxesFailure() {


        String expected[][]={{"BB","BB","BB","BB","BB","BB","BB","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String actualValue[][]=chessBoard.ColouredBoxes();
        assertNotEquals(expected,actualValue);
        assertNotNull(chessBoard);

    }
}