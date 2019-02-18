package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesVowelTest {
    PlacesVowel placesVowel;
    @Before
    public void setUp() throws Exception {
        placesVowel=new PlacesVowel();
    }

    @After
    public void tearDown() throws Exception {
        placesVowel=null;
    }

    @Test
    public void ckeckVowelSuccess() {
        String[] expected = {"Ind","Untd stts","Grmny","Egypt","czchslvk"};
        String[] actual = {"India","United states","Germany","Egypt","czechoslovakia"};
        assertArrayEquals(expected,placesVowel.checkVowel(actual));
    }

    @Test
    public void ckeckVowelFailure() {
        String[] expected = {"Ind","Unitd stts","Gerrmny","Egypt","czchslvk"};
        String[] actual = {"India","United states","Germany","Egypt","czechoslovakia"};
        assertNotEquals(expected,placesVowel.checkVowel(actual));
        assertNotNull(placesVowel.checkVowel(actual));
    }
}