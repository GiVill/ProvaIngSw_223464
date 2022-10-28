package org.example;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FunnyAlgorithmsTest extends TestCase {

    @BeforeClass
    public static void prepareAll() {
        System.out.println("Test before class");
    }

    @AfterClass
    public static void clearAll() {
        System.out.println("Tests after class");
    }

}