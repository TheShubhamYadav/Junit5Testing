package com.j5.core;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;//if we do static import, we can directly use static method without
                                                // using classname


//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestNumberHelper {

    static NumberHelper numberHelper;

//    @BeforeEach
    @BeforeAll
    public static void setUp(){
        System.out.println("setup");
        numberHelper = new NumberHelper();
    }

    @Test
    public void verifyAddNEvenNumber(){//any method we can choose
        System.out.println("HashCode : "+this.hashCode());
        long expectedValue = 6;
        long calculatedValue = numberHelper.addNEvenNumber(5);
        assertEquals(expectedValue,calculatedValue);
    }

    @Test
    public void testAddNOddNumber(){//any method we can choose
        System.out.println("HashCode : "+this.hashCode());
        long expectedValue = 4;
        long calculatedValue = numberHelper.addNOddNumber(5);
        assertEquals(expectedValue,calculatedValue);
    }

//    @AfterEach
    @AfterAll
    public static void tearDown(){
        System.out.println("tearDown");
        numberHelper = null;
    }
}
