package com.j5.core;

import java.util.stream.IntStream;

public class NumberHelper {

    public long addNEvenNumber(int n){
        return IntStream.range(0,n).filter(NumberHelper::isEven).sum();
    }

    public long addNOddNumber(int n){
        return IntStream.range(0,n).filter(NumberHelper::isOdd).sum();
    }

    public static boolean isEven(int n){
        return  n%2==0 ? true : false;
    }

    public static boolean isOdd(int n){
        return  n%2==0 ? false : true;
    }
}
