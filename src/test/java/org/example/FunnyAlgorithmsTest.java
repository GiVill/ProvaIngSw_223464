package org.example;

import org.joda.time.DateTime;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FunnyAlgorithmsTest {

    private static FunnyAlgorithms funnyAlgorithms;

    @BeforeClass
    public static void prepareAll() {
        System.out.println("Test before class");
        DateTime data = new DateTime();
        System.out.println(data);
    }

    @Before
    public void prepareTest() {
        System.out.println("before");
        funnyAlgorithms = new FunnyAlgorithms();
        DateTime data = new DateTime();
        System.out.println(data);
    }

    @AfterClass
    public static void clearAll() {
        System.out.println("Tests after class");
        DateTime data = new DateTime();
        System.out.println(data);
    }

    @After
    public void cleanTest() {
        System.out.println("after");
        DateTime data = new DateTime();
        System.out.println(data);
    }

    @Test
    public void stringToIntConverterWorks() {
        System.out.println("testing that stringToIntConverter works");
        assertEquals(0, funnyAlgorithms.stringToIntConverter("0"));
        assertEquals(1, funnyAlgorithms.stringToIntConverter("1"));
        assertEquals(5, funnyAlgorithms.stringToIntConverter("5"));
        assertEquals(8, funnyAlgorithms.stringToIntConverter("8"));
        assertEquals(14155, funnyAlgorithms.stringToIntConverter("14155"));
        DateTime data = new DateTime();
        System.out.println(data);
    }

    @Test
    public void binarySearchWorks(){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int n = 5;
        assertEquals(4,funnyAlgorithms.binarySearch(a,n));
        System.out.printf("test done");
        DateTime data = new DateTime();
        System.out.println(data);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void stringToIntConverterThrowsException() {
        System.out.println("stringToIntConverterThrowsException");
        funnyAlgorithms.stringToIntConverter("-32769");
        funnyAlgorithms.stringToIntConverter("32768");
        DateTime data = new DateTime();
        System.out.println(data);
    }

}