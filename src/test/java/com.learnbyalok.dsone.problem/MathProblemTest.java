package com.learnbyalok.dsone.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathProblemTest {

    MathProblem mathProblem = new MathProblem();
    @Test
    void findMeanTest(){
        int[] arr = {1,3,4,9};
        double result = mathProblem.findMean(arr);
        assertEquals(4.25, result);
    }

    @Test
    void findMedianTest(){
        int[] arr = {1,3,4,9,10};
        double result = mathProblem.findMedian(arr);
        assertEquals(4,result);
    }

    @Test
    void findMedianTest2(){
        int[] arr = {1,3,4,9,10,11};
        double result = mathProblem.findMedian(arr);
        assertEquals(4,result);
    }
}
