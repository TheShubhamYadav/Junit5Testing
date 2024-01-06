package com.j5l.core;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //try all 4 method order strategies
@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class) //try all 4 generation strategies
public class ArrayHelperTest {
    ArrayHelper arrayHelper;

    @BeforeEach
    public void setUp(){
        arrayHelper = new ArrayHelper();
    }

    @Test
    @Order(2)
//    @DisplayName("find max in array")
    void test_Get_Max_In_Array(){
        int[] array = {10,20,99,67,97};
        int expectedVal = 99;
        int actualVal = arrayHelper.getMaxInArray(array);
        Assertions.assertEquals(expectedVal,actualVal);
    }

    @Test
    @Order(1)
//    @DisplayName("find max in array having samenumber multiple times")
    void test_Get_Max_In_Same_Num_Array(){
        int[] array = {12,12,12,12,12};
        int expectedVal = 12;
        int actualVal = arrayHelper.getMaxInArray(array);
        Assertions.assertEquals(expectedVal,actualVal);
    }

    @AfterEach
    public void tearDown(){
        arrayHelper = null;
    }
}
