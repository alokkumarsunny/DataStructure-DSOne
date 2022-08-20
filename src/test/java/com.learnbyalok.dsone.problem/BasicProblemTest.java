package com.learnbyalok.dsone.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicProblemTest {

    @Test
    void testSwap(){
        BasicProblem swapNumber = new BasicProblem();
        int result = swapNumber.sum(2,3);
        assertEquals(5, result);
    }
}
