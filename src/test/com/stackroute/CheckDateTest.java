package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckDateTest {
    CheckDate checkDate;
    @Before
    public void setUp() throws Exception {
        checkDate=new CheckDate();
    }

    @After
    public void tearDown() throws Exception {
        checkDate=null;
    }

    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = checkDate.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = checkDate.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }
}