package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks studentMarks = null;
    @Before
    public void setUp() throws Exception {
        studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        studentMarks=null;
    }

    @Test
    public void checkGradeError() {
        int grade[]={145,167,110,187};
        assertEquals("error",studentMarks.checkGrade(4,grade));
        assertNotNull(studentMarks.checkGrade(4,grade));
    }

    @Test
    public void checkGradeNoError() {
        int grade[]={45,67,10,87};
        assertEquals("No error",studentMarks.checkGrade(4,grade));
        assertNotNull(studentMarks.checkGrade(4,grade));
    }
}