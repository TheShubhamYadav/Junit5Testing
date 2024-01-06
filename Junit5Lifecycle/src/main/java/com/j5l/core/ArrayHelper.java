package com.j5l.core;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayHelper {

    public int getMaxInArray(int[] array){
        return Arrays.stream(array).reduce(0,(num1, num2)->{
            if(num1>num2)
                return num1;
            else
                return num2;
        });
    }

}

