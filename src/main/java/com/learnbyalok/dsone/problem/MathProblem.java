package com.learnbyalok.dsone.problem;

import java.util.Arrays;

public class MathProblem {

    public double findMean(int[] arr){
        int arrLen = arr.length;
        double result = (double) Arrays.stream(arr).sum()/arrLen;
        return result;
    }
    public double findMedian(int[] arr){
        int arrLen = arr.length;
        Arrays.sort(arr);
        if(arrLen % 2 != 0){
            return arr[(arrLen-1)/2];
        }else {
            return ((double) arr[(arrLen/2)-1] + (double) arr[arrLen/2])/2;
        }

    }

}
